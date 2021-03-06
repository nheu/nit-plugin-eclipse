package org.nitlanguage.ndt.ui.editor;

import java.io.IOException;
import java.io.PushbackReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.LineBackgroundEvent;
import org.eclipse.swt.custom.LineBackgroundListener;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.nitlanguage.gen.lexer.Lexer;
import org.nitlanguage.gen.lexer.LexerException;
import org.nitlanguage.gen.node.TExternCodeSegment;
import org.nitlanguage.ndt.core.model.ctools.CLexerHelper;
/**
 * Scanner used by the NitEditor to highlight words in the editor
 * @author lucas.bajolet
 * @author nathan.heu
 */
public class NitScanner implements ITokenScanner, LineBackgroundListener{

	/** The document to scan tokens in */
	protected IDocument doc;

	/** The end offset of the range to be scanned */
	protected int fRangeEnd;

	/** The offset of the last read token */
	protected int fTokenOffset;

	/** The length of the last read token */
	protected int fTokenLength;

	/** Converter from IDocument to Reader object (mandatory for use in Lexer) */
	protected DocumentBufferStream docStr = new DocumentBufferStream();

	/** The Lexer configured for Nit and generated by SableCC */
	protected Lexer lex;
	
	/** 
	 * Used for nit extern code support. 
	 * Map containing the background color for lines written in an nit extern block (ex: C code)
	 */
	Map<Integer, Color> lineStyles = new HashMap<Integer, Color>();
	
	/**
	 * Used for nit extern code support. 
	 * A queue containing each token of an extern block
	 */
	Queue<org.nitlanguage.gen.simplec.node.Token> externBlock 
	= new LinkedList<org.nitlanguage.gen.simplec.node.Token>();

	@Override
	public int getTokenOffset() {
		return this.fTokenOffset;
	}

	@Override
	public int getTokenLength() {
		return this.fTokenLength;
	}
	
	/**
	 * @param document : The document to set
	 * Changes the document to scan for tokens
	 */
	public void setDocument(IDocument document) {
		if (document != null) {
			this.doc = document;
			docStr.setDoc(this.doc);
			docStr.setRange(0, doc.getLength());
		}
	}

	@Override
	public void setRange(IDocument document, int offset, int length) {
		// Had to recreate the Lexer because the only way to stop parsing is by
		// arriving at EOF, when he does, there is no way to reset him
		// The second argument of PushBackReader is here to prevent random
		// crashes because of the PushbackReader buffer when encountering tokens
		// like .. or ...
		lex = new Lexer(new PushbackReader(this.docStr, 2));
		setDocument(document);
		lineStyles = new HashMap<Integer, Color>();
	}
	
	@Override
	public IToken nextToken() {
		
		if(!externBlock.isEmpty()){
			return getPendingCToken();
		}
		if (this.doc != null) {
			try {				
				org.nitlanguage.gen.node.Token tok = lex.next();
						
				if(tok instanceof TExternCodeSegment){
					//on parse le token nit "Extern C" en tokens C
					//puis on add chacun de ces tokens.
					//on poll le dernier Token
					//return externBlock.poll();
					externBlock = new CLexerHelper(tok.getText()).getASTTokens();
					fTokenOffset = this.computePositionFromOfToken(tok);
					fTokenLength = 0;
					computeExternCodeBackground((TExternCodeSegment)tok);
					return getPendingCToken();
				}
				else {
					this.fTokenLength = tok.getText().length();
					this.fTokenOffset = this.computePositionFromOfToken(tok);
					
					if (tok instanceof org.nitlanguage.gen.node.EOF) {
						return Token.EOF;
					} else {
						return new Token(NitColorReposit.getInstance()
								.getStyleForKeyWord(tok.getClass()));
					}
				}
			} catch (LexerException e) {

				// A LexerException is thrown when an unknown token is
				// recognized by the Lexer (Like unfinished string token or ;)
				this.fTokenLength = this.docStr.currOffset
						- (this.fTokenOffset + this.fTokenLength);
				this.fTokenOffset = this.docStr.currOffset - this.fTokenLength;

				return new Token(new TextAttribute(new Color(
						Display.getCurrent(), new RGB(255, 0, 0)), null,
						SWT.UNDERLINE_ERROR));
			} catch (IOException e) {
				// This should never happen
				this.fTokenLength = docStr.currOffset - this.fTokenOffset;
				return new Token(new TextAttribute(new Color(
						Display.getCurrent(), new RGB(255, 0, 0)), null,
						SWT.UNDERLINE_ERROR));
			}
		} else {
			return Token.EOF;
		}
	}

	/**
	 * Computes the origin offset in the document of the token returned by the lexer
	 * @param tok : The token to get the origin position from
	 * @return the position computed from the document
	 */
	private int computePositionFromOfToken(org.nitlanguage.gen.node.Token tok) {
		try {
			int linesToAdd = this.doc.getLineOfOffset(this.docStr.fStartRange);
			int test = this.doc.getLineOffset(linesToAdd + tok.getLine() - 1);
			int tokPos = (tok.getPos() - 1);
			return test + tokPos;
		} catch (BadLocationException e) {
			return -1;
		}
	}
	
	/**
	 * Used for nit extern code support.
	 * Returns a jface-token corresponding to the current C token to be returned
	 * Actually, this method is a shortcut for nextToken() which only returns
	 * jface-tokens corresponding to nit tokens
	 * @return
	 */
	private IToken getPendingCToken(){
		org.nitlanguage.gen.simplec.node.Token ctoken = externBlock.poll();
		assert(ctoken != null);
		this.fTokenOffset += getTokenLength();
		this.fTokenLength = ctoken.getText().length();
		return new Token(CColorReposit.getInstance().
					getStyleForKeyWord(ctoken.getClass()));
	}
	
	/**
	 * Used for nit extern code support. 
	 * Set the background color of lines between a nit extern opening character
	 * and a nit extern closing character
	 * Note : if opening and closing character are on the same line or one line spaced
	 * then no line will be painted. 
	 * @param cCode
	 */
	private void computeExternCodeBackground(TExternCodeSegment cCode){
		try {
			int beginLine = this.doc.getLineOfOffset(fTokenOffset + fTokenLength);
			int endLine = doc.getLineOfOffset(fTokenOffset + cCode.getText().length());
			for(int startLine = beginLine + 1; startLine < endLine; startLine ++){
				lineStyles.put(startLine, CColorReposit.lineBackground);
			}
		} catch (BadLocationException e) {
		}
	}
	
	/**
	 * Used for nit extern code support. 
	 * Returns the background color associated whith a given line
	 * @param line
	 * @return
	 */
	public Color getLineStyle(int line){
		return lineStyles.get(line);
	}

	@Override
	public void lineGetBackground(LineBackgroundEvent event) {
		int line = ((StyledText) event.widget).getLineAtOffset(event.lineOffset);
		Color col = getLineStyle(line);
		if(col != null) event.lineBackground = col;
	}

}
