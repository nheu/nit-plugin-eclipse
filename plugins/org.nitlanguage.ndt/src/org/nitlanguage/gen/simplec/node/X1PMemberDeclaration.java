/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import org.nitlanguage.gen.simplec.analysis.*;

public final class X1PMemberDeclaration extends XPMemberDeclaration
{
    private XPMemberDeclaration _xPMemberDeclaration_;
    private PMemberDeclaration _pMemberDeclaration_;

    public X1PMemberDeclaration()
    {
    }

    public X1PMemberDeclaration(
        XPMemberDeclaration _xPMemberDeclaration_,
        PMemberDeclaration _pMemberDeclaration_)
    {
        setXPMemberDeclaration(_xPMemberDeclaration_);
        setPMemberDeclaration(_pMemberDeclaration_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPMemberDeclaration getXPMemberDeclaration()
    {
        return _xPMemberDeclaration_;
    }

    public void setXPMemberDeclaration(XPMemberDeclaration node)
    {
        if(_xPMemberDeclaration_ != null)
        {
            _xPMemberDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPMemberDeclaration_ = node;
    }

    public PMemberDeclaration getPMemberDeclaration()
    {
        return _pMemberDeclaration_;
    }

    public void setPMemberDeclaration(PMemberDeclaration node)
    {
        if(_pMemberDeclaration_ != null)
        {
            _pMemberDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pMemberDeclaration_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPMemberDeclaration_ == child)
        {
            _xPMemberDeclaration_ = null;
        }

        if(_pMemberDeclaration_ == child)
        {
            _pMemberDeclaration_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPMemberDeclaration_) +
            toString(_pMemberDeclaration_);
    }
}
