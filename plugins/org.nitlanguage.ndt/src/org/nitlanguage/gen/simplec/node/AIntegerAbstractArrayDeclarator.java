/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AIntegerAbstractArrayDeclarator extends PAbstractArrayDeclarator
{
    private TLBracket _lBracket_;
    private TIntegerConstant _integerConstant_;
    private TRBracket _rBracket_;

    public AIntegerAbstractArrayDeclarator()
    {
    }

    public AIntegerAbstractArrayDeclarator(
        TLBracket _lBracket_,
        TIntegerConstant _integerConstant_,
        TRBracket _rBracket_)
    {
        setLBracket(_lBracket_);

        setIntegerConstant(_integerConstant_);

        setRBracket(_rBracket_);

    }
    public Object clone()
    {
        return new AIntegerAbstractArrayDeclarator(
            (TLBracket) cloneNode(_lBracket_),
            (TIntegerConstant) cloneNode(_integerConstant_),
            (TRBracket) cloneNode(_rBracket_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIntegerAbstractArrayDeclarator(this);
    }

    public TLBracket getLBracket()
    {
        return _lBracket_;
    }

    public void setLBracket(TLBracket node)
    {
        if(_lBracket_ != null)
        {
            _lBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lBracket_ = node;
    }

    public TIntegerConstant getIntegerConstant()
    {
        return _integerConstant_;
    }

    public void setIntegerConstant(TIntegerConstant node)
    {
        if(_integerConstant_ != null)
        {
            _integerConstant_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _integerConstant_ = node;
    }

    public TRBracket getRBracket()
    {
        return _rBracket_;
    }

    public void setRBracket(TRBracket node)
    {
        if(_rBracket_ != null)
        {
            _rBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rBracket_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lBracket_)
            + toString(_integerConstant_)
            + toString(_rBracket_);
    }

    void removeChild(Node child)
    {
        if(_lBracket_ == child)
        {
            _lBracket_ = null;
            return;
        }

        if(_integerConstant_ == child)
        {
            _integerConstant_ = null;
            return;
        }

        if(_rBracket_ == child)
        {
            _rBracket_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_lBracket_ == oldChild)
        {
            setLBracket((TLBracket) newChild);
            return;
        }

        if(_integerConstant_ == oldChild)
        {
            setIntegerConstant((TIntegerConstant) newChild);
            return;
        }

        if(_rBracket_ == oldChild)
        {
            setRBracket((TRBracket) newChild);
            return;
        }

    }
}
