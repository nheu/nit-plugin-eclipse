/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class ALongSignedLongSpecifier extends PSignedLongSpecifier
{
    private TLong _long_;

    public ALongSignedLongSpecifier()
    {
    }

    public ALongSignedLongSpecifier(
        TLong _long_)
    {
        setLong(_long_);

    }
    public Object clone()
    {
        return new ALongSignedLongSpecifier(
            (TLong) cloneNode(_long_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALongSignedLongSpecifier(this);
    }

    public TLong getLong()
    {
        return _long_;
    }

    public void setLong(TLong node)
    {
        if(_long_ != null)
        {
            _long_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _long_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_long_);
    }

    void removeChild(Node child)
    {
        if(_long_ == child)
        {
            _long_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_long_ == oldChild)
        {
            setLong((TLong) newChild);
            return;
        }

    }
}
