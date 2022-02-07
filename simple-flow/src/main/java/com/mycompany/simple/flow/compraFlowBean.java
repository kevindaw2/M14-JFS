/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.flow;

import java.io.Serializable;
import javax.faces.flow.Flow;
import javax.inject.Named;
import javax.faces.flow.FlowScoped;
import javax.faces.flow.builder.FlowBuilder;
import javax.faces.flow.builder.FlowBuilderParameter;
import javax.faces.flow.builder.FlowDefinition;
import javax.ws.rs.Produces;

/**
 *
 * @author kguina.daw2n
 */
@Named
@FlowScoped("compraFlow")
public class compraFlowBean implements Serializable {

    private String nom, adreca, adreca2, pais, ciutat;

    @Produces
    @FlowDefinition

    public Flow defineFlow(@FlowBuilderParameter FlowBuilder flowBuilder) {
        String flowId = "compraFlow";

        flowBuilder.id("", flowId);
        flowBuilder.viewNode(flowId, "/" + flowId + "/" + flowId + "/" + ".xhtml").markAsStartNode();
        flowBuilder.returnNode("retorna").fromOutcome("#{compraFlow.retorna}");
        flowBuilder.inboundParameter("param1Compra", "#{flowScope.param1}");
        flowBuilder.inboundParameter("param2Compra", "#{flowScope.param2}");
        flowBuilder.flowCallNode("cridacorreu").flowReference("", "correuFlow").outboundParameter("param1Compra", "#{compraFlowBean.nom}").outboundParameter("param2Compra", "#{compraFlowBean.ciutat}");

        return flowBuilder.getFlow();
    }

    public String getRetorna() {
        return "/index.xhtml";
    }

    public String cridaCorreu() {
        return "/correuFlow.xhtml";
    }

    /**
     * Creates a new instance of compraFlow
     */
    public compraFlowBean() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getAdreca2() {
        return adreca2;
    }

    public void setAdreca2(String adreca2) {
        this.adreca2 = adreca2;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

}
