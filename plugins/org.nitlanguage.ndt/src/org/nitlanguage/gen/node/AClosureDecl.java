/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.Analysis;

@SuppressWarnings("nls")
public final class AClosureDecl extends PClosureDecl
{
    private TKwbreak _kwbreak_;
    private TBang _bang_;
    private TId _id_;
    private PSignature _signature_;
    private PExpr _expr_;

    public AClosureDecl()
    {
        // Constructor
    }

    public AClosureDecl(
        @SuppressWarnings("hiding") TKwbreak _kwbreak_,
        @SuppressWarnings("hiding") TBang _bang_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") PSignature _signature_,
        @SuppressWarnings("hiding") PExpr _expr_)
    {
        // Constructor
        setKwbreak(_kwbreak_);

        setBang(_bang_);

        setId(_id_);

        setSignature(_signature_);

        setExpr(_expr_);

    }

    @Override
    public Object clone()
    {
        return new AClosureDecl(
            cloneNode(this._kwbreak_),
            cloneNode(this._bang_),
            cloneNode(this._id_),
            cloneNode(this._signature_),
            cloneNode(this._expr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAClosureDecl(this);
    }

    public TKwbreak getKwbreak()
    {
        return this._kwbreak_;
    }

    public void setKwbreak(TKwbreak node)
    {
        if(this._kwbreak_ != null)
        {
            this._kwbreak_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwbreak_ = node;
    }

    public TBang getBang()
    {
        return this._bang_;
    }

    public void setBang(TBang node)
    {
        if(this._bang_ != null)
        {
            this._bang_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bang_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public PSignature getSignature()
    {
        return this._signature_;
    }

    public void setSignature(PSignature node)
    {
        if(this._signature_ != null)
        {
            this._signature_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._signature_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._kwbreak_)
            + toString(this._bang_)
            + toString(this._id_)
            + toString(this._signature_)
            + toString(this._expr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._kwbreak_ == child)
        {
            this._kwbreak_ = null;
            return;
        }

        if(this._bang_ == child)
        {
            this._bang_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._signature_ == child)
        {
            this._signature_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._kwbreak_ == oldChild)
        {
            setKwbreak((TKwbreak) newChild);
            return;
        }

        if(this._bang_ == oldChild)
        {
            setBang((TBang) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._signature_ == oldChild)
        {
            setSignature((PSignature) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
