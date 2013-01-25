/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.*;

@SuppressWarnings("nls")
public final class AGeMethid extends PMethid
{
    private TGe _ge_;

    public AGeMethid()
    {
        // Constructor
    }

    public AGeMethid(
        @SuppressWarnings("hiding") TGe _ge_)
    {
        // Constructor
        setGe(_ge_);

    }

    @Override
    public Object clone()
    {
        return new AGeMethid(
            cloneNode(this._ge_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGeMethid(this);
    }

    public TGe getGe()
    {
        return this._ge_;
    }

    public void setGe(TGe node)
    {
        if(this._ge_ != null)
        {
            this._ge_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ge_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ge_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ge_ == child)
        {
            this._ge_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ge_ == oldChild)
        {
            setGe((TGe) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}