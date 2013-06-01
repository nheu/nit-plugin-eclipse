/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class ADirectPointerFunction extends PPointerFunction
{
    private TStar _star_;
    private PDirectFunctionDeclarator _directFunctionDeclarator_;

    public ADirectPointerFunction()
    {
    }

    public ADirectPointerFunction(
        TStar _star_,
        PDirectFunctionDeclarator _directFunctionDeclarator_)
    {
        setStar(_star_);

        setDirectFunctionDeclarator(_directFunctionDeclarator_);

    }
    public Object clone()
    {
        return new ADirectPointerFunction(
            (TStar) cloneNode(_star_),
            (PDirectFunctionDeclarator) cloneNode(_directFunctionDeclarator_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADirectPointerFunction(this);
    }

    public TStar getStar()
    {
        return _star_;
    }

    public void setStar(TStar node)
    {
        if(_star_ != null)
        {
            _star_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _star_ = node;
    }

    public PDirectFunctionDeclarator getDirectFunctionDeclarator()
    {
        return _directFunctionDeclarator_;
    }

    public void setDirectFunctionDeclarator(PDirectFunctionDeclarator node)
    {
        if(_directFunctionDeclarator_ != null)
        {
            _directFunctionDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _directFunctionDeclarator_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_star_)
            + toString(_directFunctionDeclarator_);
    }

    void removeChild(Node child)
    {
        if(_star_ == child)
        {
            _star_ = null;
            return;
        }

        if(_directFunctionDeclarator_ == child)
        {
            _directFunctionDeclarator_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_star_ == oldChild)
        {
            setStar((TStar) newChild);
            return;
        }

        if(_directFunctionDeclarator_ == oldChild)
        {
            setDirectFunctionDeclarator((PDirectFunctionDeclarator) newChild);
            return;
        }

    }
}
