/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AUnaryRhs extends PRhs
{
    private PUnaryExpression _unaryExpression_;

    public AUnaryRhs()
    {
    }

    public AUnaryRhs(
        PUnaryExpression _unaryExpression_)
    {
        setUnaryExpression(_unaryExpression_);

    }
    public Object clone()
    {
        return new AUnaryRhs(
            (PUnaryExpression) cloneNode(_unaryExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnaryRhs(this);
    }

    public PUnaryExpression getUnaryExpression()
    {
        return _unaryExpression_;
    }

    public void setUnaryExpression(PUnaryExpression node)
    {
        if(_unaryExpression_ != null)
        {
            _unaryExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unaryExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unaryExpression_);
    }

    void removeChild(Node child)
    {
        if(_unaryExpression_ == child)
        {
            _unaryExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unaryExpression_ == oldChild)
        {
            setUnaryExpression((PUnaryExpression) newChild);
            return;
        }

    }
}
