/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.node;

import org.nitlanguage.gen.analysis.*;

@SuppressWarnings("nls")
public final class ATypePropdef extends PPropdef
{
    private PDoc _doc_;
    private TKwredef _kwredef_;
    private PVisibility _visibility_;
    private TKwtype _kwtype_;
    private TClassid _id_;
    private PType _type_;

    public ATypePropdef()
    {
        // Constructor
    }

    public ATypePropdef(
        @SuppressWarnings("hiding") PDoc _doc_,
        @SuppressWarnings("hiding") TKwredef _kwredef_,
        @SuppressWarnings("hiding") PVisibility _visibility_,
        @SuppressWarnings("hiding") TKwtype _kwtype_,
        @SuppressWarnings("hiding") TClassid _id_,
        @SuppressWarnings("hiding") PType _type_)
    {
        // Constructor
        setDoc(_doc_);

        setKwredef(_kwredef_);

        setVisibility(_visibility_);

        setKwtype(_kwtype_);

        setId(_id_);

        setType(_type_);

    }

    @Override
    public Object clone()
    {
        return new ATypePropdef(
            cloneNode(this._doc_),
            cloneNode(this._kwredef_),
            cloneNode(this._visibility_),
            cloneNode(this._kwtype_),
            cloneNode(this._id_),
            cloneNode(this._type_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATypePropdef(this);
    }

    public PDoc getDoc()
    {
        return this._doc_;
    }

    public void setDoc(PDoc node)
    {
        if(this._doc_ != null)
        {
            this._doc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doc_ = node;
    }

    public TKwredef getKwredef()
    {
        return this._kwredef_;
    }

    public void setKwredef(TKwredef node)
    {
        if(this._kwredef_ != null)
        {
            this._kwredef_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwredef_ = node;
    }

    public PVisibility getVisibility()
    {
        return this._visibility_;
    }

    public void setVisibility(PVisibility node)
    {
        if(this._visibility_ != null)
        {
            this._visibility_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._visibility_ = node;
    }

    public TKwtype getKwtype()
    {
        return this._kwtype_;
    }

    public void setKwtype(TKwtype node)
    {
        if(this._kwtype_ != null)
        {
            this._kwtype_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._kwtype_ = node;
    }

    public TClassid getId()
    {
        return this._id_;
    }

    public void setId(TClassid node)
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

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._doc_)
            + toString(this._kwredef_)
            + toString(this._visibility_)
            + toString(this._kwtype_)
            + toString(this._id_)
            + toString(this._type_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._doc_ == child)
        {
            this._doc_ = null;
            return;
        }

        if(this._kwredef_ == child)
        {
            this._kwredef_ = null;
            return;
        }

        if(this._visibility_ == child)
        {
            this._visibility_ = null;
            return;
        }

        if(this._kwtype_ == child)
        {
            this._kwtype_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._doc_ == oldChild)
        {
            setDoc((PDoc) newChild);
            return;
        }

        if(this._kwredef_ == oldChild)
        {
            setKwredef((TKwredef) newChild);
            return;
        }

        if(this._visibility_ == oldChild)
        {
            setVisibility((PVisibility) newChild);
            return;
        }

        if(this._kwtype_ == oldChild)
        {
            setKwtype((TKwtype) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TClassid) newChild);
            return;
        }

        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}