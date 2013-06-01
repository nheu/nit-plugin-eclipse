/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AIdentifierFunctionDeclaration extends PFunctionDeclaration
{
    private TIdentifier _identifier_;
    private PFunctionDeclarator _functionDeclarator_;
    private TSemicolon _semicolon_;

    public AIdentifierFunctionDeclaration()
    {
    }

    public AIdentifierFunctionDeclaration(
        TIdentifier _identifier_,
        PFunctionDeclarator _functionDeclarator_,
        TSemicolon _semicolon_)
    {
        setIdentifier(_identifier_);

        setFunctionDeclarator(_functionDeclarator_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AIdentifierFunctionDeclaration(
            (TIdentifier) cloneNode(_identifier_),
            (PFunctionDeclarator) cloneNode(_functionDeclarator_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIdentifierFunctionDeclaration(this);
    }

    public TIdentifier getIdentifier()
    {
        return _identifier_;
    }

    public void setIdentifier(TIdentifier node)
    {
        if(_identifier_ != null)
        {
            _identifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _identifier_ = node;
    }

    public PFunctionDeclarator getFunctionDeclarator()
    {
        return _functionDeclarator_;
    }

    public void setFunctionDeclarator(PFunctionDeclarator node)
    {
        if(_functionDeclarator_ != null)
        {
            _functionDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _functionDeclarator_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_identifier_)
            + toString(_functionDeclarator_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_identifier_ == child)
        {
            _identifier_ = null;
            return;
        }

        if(_functionDeclarator_ == child)
        {
            _functionDeclarator_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_identifier_ == oldChild)
        {
            setIdentifier((TIdentifier) newChild);
            return;
        }

        if(_functionDeclarator_ == oldChild)
        {
            setFunctionDeclarator((PFunctionDeclarator) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}