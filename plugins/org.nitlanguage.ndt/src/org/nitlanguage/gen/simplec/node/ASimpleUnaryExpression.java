/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class ASimpleUnaryExpression extends PUnaryExpression
{
    private PSimpleExpression _simpleExpression_;

    public ASimpleUnaryExpression()
    {
    }

    public ASimpleUnaryExpression(
        PSimpleExpression _simpleExpression_)
    {
        setSimpleExpression(_simpleExpression_);

    }
    public Object clone()
    {
        return new ASimpleUnaryExpression(
            (PSimpleExpression) cloneNode(_simpleExpression_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASimpleUnaryExpression(this);
    }

    public PSimpleExpression getSimpleExpression()
    {
        return _simpleExpression_;
    }

    public void setSimpleExpression(PSimpleExpression node)
    {
        if(_simpleExpression_ != null)
        {
            _simpleExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _simpleExpression_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_simpleExpression_);
    }

    void removeChild(Node child)
    {
        if(_simpleExpression_ == child)
        {
            _simpleExpression_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_simpleExpression_ == oldChild)
        {
            setSimpleExpression((PSimpleExpression) newChild);
            return;
        }

    }
}
