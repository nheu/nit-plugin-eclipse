/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class TKwprivate extends Token
{
    public TKwprivate()
    {
        super.setText("private");
    }

    public TKwprivate(int line, int pos)
    {
        super.setText("private");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TKwprivate(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTKwprivate(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TKwprivate text.");
    }
}
