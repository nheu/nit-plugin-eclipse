/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AFloatingConstant extends PConstant
{
    private PUnop _unop_;
    private TFloatingConstant _floatingConstant_;

    public AFloatingConstant()
    {
    }

    public AFloatingConstant(
        PUnop _unop_,
        TFloatingConstant _floatingConstant_)
    {
        setUnop(_unop_);

        setFloatingConstant(_floatingConstant_);

    }
    public Object clone()
    {
        return new AFloatingConstant(
            (PUnop) cloneNode(_unop_),
            (TFloatingConstant) cloneNode(_floatingConstant_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFloatingConstant(this);
    }

    public PUnop getUnop()
    {
        return _unop_;
    }

    public void setUnop(PUnop node)
    {
        if(_unop_ != null)
        {
            _unop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _unop_ = node;
    }

    public TFloatingConstant getFloatingConstant()
    {
        return _floatingConstant_;
    }

    public void setFloatingConstant(TFloatingConstant node)
    {
        if(_floatingConstant_ != null)
        {
            _floatingConstant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _floatingConstant_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_unop_)
            + toString(_floatingConstant_);
    }

    void removeChild(Node child)
    {
        if(_unop_ == child)
        {
            _unop_ = null;
            return;
        }

        if(_floatingConstant_ == child)
        {
            _floatingConstant_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_unop_ == oldChild)
        {
            setUnop((PUnop) newChild);
            return;
        }

        if(_floatingConstant_ == oldChild)
        {
            setFloatingConstant((TFloatingConstant) newChild);
            return;
        }

    }
}
