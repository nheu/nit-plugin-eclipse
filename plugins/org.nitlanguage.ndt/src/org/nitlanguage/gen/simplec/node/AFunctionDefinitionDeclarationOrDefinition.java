/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.nitlanguage.gen.simplec.node;

import java.util.*;
import org.nitlanguage.gen.simplec.analysis.*;

public final class AFunctionDefinitionDeclarationOrDefinition extends PDeclarationOrDefinition
{
    private PFunctionDefinition _functionDefinition_;

    public AFunctionDefinitionDeclarationOrDefinition()
    {
    }

    public AFunctionDefinitionDeclarationOrDefinition(
        PFunctionDefinition _functionDefinition_)
    {
        setFunctionDefinition(_functionDefinition_);

    }
    public Object clone()
    {
        return new AFunctionDefinitionDeclarationOrDefinition(
            (PFunctionDefinition) cloneNode(_functionDefinition_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionDefinitionDeclarationOrDefinition(this);
    }

    public PFunctionDefinition getFunctionDefinition()
    {
        return _functionDefinition_;
    }

    public void setFunctionDefinition(PFunctionDefinition node)
    {
        if(_functionDefinition_ != null)
        {
            _functionDefinition_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _functionDefinition_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_functionDefinition_);
    }

    void removeChild(Node child)
    {
        if(_functionDefinition_ == child)
        {
            _functionDefinition_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_functionDefinition_ == oldChild)
        {
            setFunctionDefinition((PFunctionDefinition) newChild);
            return;
        }

    }
}
