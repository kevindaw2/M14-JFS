/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.flow;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.flow.Flow;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;


/**
 *
 * @author kguina.daw2n
 */
public class compraFlow implements Serializable {

    @Produces
    @FlowDefinition
    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "compraFlow";
        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + ".xhtml").markAsStartNode();
        flowBuilder.returnNode("retorna").fromOutcome("#{compraFlowBean.retorna}");
        flowBuilder.inboundParameter("param1Compra", "#{flowScope.param1}");
        flowBuilder.inboundParameter("param2Compra", "#{flowScope.param2}");
        flowBuilder.flowCallNode("cridacorreu").flowReference("", "correuFlow").outboundParameter("param1Compra", "#{compraFlowBean.nom}").outboundParameter("param2Compra", "#{compraFlowBean.ciutat}");
        return flowBuilder.getFlow();
    }
}   