/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AVarnameSimpleExpression extends PSimpleExpression
{
    private PVarname _varname_;

    public AVarnameSimpleExpression()
    {
    }

    public AVarnameSimpleExpression(
        PVarname _varname_)
    {
        setVarname(_varname_);

    }
    public Object clone()
    {
        return new AVarnameSimpleExpression(
            (PVarname) cloneNode(_varname_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAVarnameSimpleExpression(this);
    }

    public PVarname getVarname()
    {
        return _varname_;
    }

    public void setVarname(PVarname node)
    {
        if(_varname_ != null)
        {
            _varname_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _varname_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_varname_);
    }

    void removeChild(Node child)
    {
        if(_varname_ == child)
        {
            _varname_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_varname_ == oldChild)
        {
            setVarname((PVarname) newChild);
            return;
        }

    }
}
