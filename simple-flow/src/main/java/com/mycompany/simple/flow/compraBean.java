/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.flow;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author kguina.daw2n
 */
@Named(value = "compraBean")
@SessionScoped
public class compraBean implements Serializable {
    
    private int cantitatLlibre; 
    private double costTotal; 

    public compraBean() {
    }

    public int getCantitatLlibre() {
        return cantitatLlibre;
    }

    public void setCantitatLlibre(int cantitatLlibre) {
        this.cantitatLlibre = cantitatLlibre;
    }

    public double getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(double costTotal) {
        this.costTotal = costTotal;
    }
       
}