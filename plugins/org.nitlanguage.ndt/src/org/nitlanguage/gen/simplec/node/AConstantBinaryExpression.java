/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AConstantBinaryExpression extends PBinaryExpression
{
    private TLPar _lPar_;
    private PConstant _constant_;
    private PBinop _binop_;
    private PValue _value_;
    private TRPar _rPar_;

    public AConstantBinaryExpression()
    {
    }

    public AConstantBinaryExpression(
        TLPar _lPar_,
        PConstant _constant_,
        PBinop _binop_,
        PValue _value_,
        TRPar _rPar_)
    {
        setLPar(_lPar_);

        setConstant(_constant_);

        setBinop(_binop_);

        setValue(_value_);

        setRPar(_rPar_);

    }
    public Object clone()
    {
        return new AConstantBinaryExpression(
            (TLPar) cloneNode(_lPar_),
            (PConstant) cloneNode(_constant_),
            (PBinop) cloneNode(_binop_),
            (PValue) cloneNode(_value_),
            (TRPar) cloneNode(_rPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAConstantBinaryExpression(this);
    }

    public TLPar getLPar()
    {
        return _lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(_lPar_ != null)
        {
            _lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lPar_ = node;
    }

    public PConstant getConstant()
    {
        return _constant_;
    }

    public void setConstant(PConstant node)
    {
        if(_constant_ != null)
        {
            _constant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _constant_ = node;
    }

    public PBinop getBinop()
    {
        return _binop_;
    }

    public void setBinop(PBinop node)
    {
        if(_binop_ != null)
        {
            _binop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _binop_ = node;
    }

    public PValue getValue()
    {
        return _value_;
    }

    public void setValue(PValue node)
    {
        if(_value_ != null)
        {
            _value_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _value_ = node;
    }

    public TRPar getRPar()
    {
        return _rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(_rPar_ != null)
        {
            _rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rPar_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lPar_)
            + toString(_constant_)
            + toString(_binop_)
            + toString(_value_)
            + toString(_rPar_);
    }

    void removeChild(Node child)
    {
        if(_lPar_ == child)
        {
            _lPar_ = null;
            return;
        }

        if(_constant_ == child)
        {
            _constant_ = null;
            return;
        }

        if(_binop_ == child)
        {
            _binop_ = null;
            return;
        }

        if(_value_ == child)
        {
            _value_ = null;
            return;
        }

        if(_rPar_ == child)
        {
            _rPar_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(_constant_ == oldChild)
        {
            setConstant((PConstant) newChild);
            return;
        }

        if(_binop_ == oldChild)
        {
            setBinop((PBinop) newChild);
            return;
        }

        if(_value_ == oldChild)
        {
            setValue((PValue) newChild);
            return;
        }

        if(_rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

    }
}
