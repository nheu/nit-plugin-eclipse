/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AUnsignedLongTypeSpecifier extends PTypeSpecifier
{
    private PUnsignedLongSpecifier _unsignedLongSpecifier_;

    public AUnsignedLongTypeSpecifier()
    {
    }

    public AUnsignedLongTypeSpecifier(
        PUnsignedLongSpecifier _unsignedLongSpecifier_)
    {
        setUnsignedLongSpecifier(_unsignedLongSpecifier_);

    }
    public Object clone()
    {
        return new AUnsignedLongTypeSpecifier(
            (PUnsignedLongSpecifier) cloneNode(_unsignedLongSpecifier_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAUnsignedLongTypeSpecifier(this);
    }

    public PUnsignedLongSpecifier getUnsignedLongSpecifier()
    {
        return _unsignedLongSpecifier_;
    }

    public void setUnsignedLongSpecifier(PUnsignedLongSpecifier node)
    {
        if(_unsignedLongSpecifier_ != null)
        {
            _unsignedLongSpecifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unsignedLongSpecifier_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unsignedLongSpecifier_);
    }

    void removeChild(Node child)
    {
        if(_unsignedLongSpecifier_ == child)
        {
            _unsignedLongSpecifier_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unsignedLongSpecifier_ == oldChild)
        {
            setUnsignedLongSpecifier((PUnsignedLongSpecifier) newChild);
            return;
        }

    }
}
