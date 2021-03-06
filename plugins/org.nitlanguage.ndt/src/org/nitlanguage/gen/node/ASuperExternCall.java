/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class ASuperExternCall extends PExternCall
{
    private TKwsuper _kwsuper_;

    public ASuperExternCall()
    {
        // Constructor
    }

    public ASuperExternCall(
        @SuppressWarnings("hiding") TKwsuper _kwsuper_)
    {
        // Constructor
        setKwsuper(_kwsuper_);

    }

    @Override
    public Object clone()
    {
        return new ASuperExternCall(
            cloneNode(this._kwsuper_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASuperExternCall(this);
    }

    public TKwsuper getKwsuper()
    {
        return this._kwsuper_;
    }

    public void setKwsuper(TKwsuper node)
    {
        if(this._kwsuper_ != null)
        {
            this._kwsuper_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwsuper_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwsuper_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwsuper_ == child)
        {
            this._kwsuper_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwsuper_ == oldChild)
        {
            setKwsuper((TKwsuper) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
