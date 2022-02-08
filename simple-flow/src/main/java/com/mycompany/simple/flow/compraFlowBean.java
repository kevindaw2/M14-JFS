/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.flow;

import javax.inject.Named;
import java.io.Serializable;
import javax.faces.flow.FlowScoped;

/**
 *
 * @author kguina.daw2n
 */
@Named
@FlowScoped("compraFlow")
public class compraFlowBean implements Serializable {

    private String nom, adreca, adreca2, pais, ciutat;

    public compraFlowBean() {
    }

    public String getRetorna() {
        return "/index";
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
