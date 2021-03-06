/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class X1PReflist extends XPReflist
{
    private XPReflist _xPReflist_;
    private PReflist _pReflist_;

    public X1PReflist()
    {
    }

    public X1PReflist(
        XPReflist _xPReflist_,
        PReflist _pReflist_)
    {
        setXPReflist(_xPReflist_);
        setPReflist(_pReflist_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPReflist getXPReflist()
    {
        return _xPReflist_;
    }

    public void setXPReflist(XPReflist node)
    {
        if(_xPReflist_ != null)
        {
            _xPReflist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPReflist_ = node;
    }

    public PReflist getPReflist()
    {
        return _pReflist_;
    }

    public void setPReflist(PReflist node)
    {
        if(_pReflist_ != null)
        {
            _pReflist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pReflist_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPReflist_ == child)
        {
            _xPReflist_ = null;
        }

        if(_pReflist_ == child)
        {
            _pReflist_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPReflist_) +
            toString(_pReflist_);
    }
}
