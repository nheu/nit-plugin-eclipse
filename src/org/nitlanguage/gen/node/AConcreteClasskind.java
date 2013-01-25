/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.*;

@SuppressWarnings("nls")
public final class AConcreteClasskind extends PClasskind
{
    private TKwclass _kwclass_;

    public AConcreteClasskind()
    {
        // Constructor
    }

    public AConcreteClasskind(
        @SuppressWarnings("hiding") TKwclass _kwclass_)
    {
        // Constructor
        setKwclass(_kwclass_);

    }

    @Override
    public Object clone()
    {
        return new AConcreteClasskind(
            cloneNode(this._kwclass_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConcreteClasskind(this);
    }

    public TKwclass getKwclass()
    {
        return this._kwclass_;
    }

    public void setKwclass(TKwclass node)
    {
        if(this._kwclass_ != null)
        {
            this._kwclass_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwclass_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwclass_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwclass_ == child)
        {
            this._kwclass_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwclass_ == oldChild)
        {
            setKwclass((TKwclass) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}