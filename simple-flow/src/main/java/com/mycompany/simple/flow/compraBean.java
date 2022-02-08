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
    
    private int llibres;
    private double preuTotal;

    public compraBean() {}

    public int getLlibres() {
        return llibres;
    }

    public void setLlibres(int llibres) {
        this.llibres = llibres;
    }

    public double getPreuTotal() {
        return preuTotal;
    }

    public void setPreuTotal(double preuTotal) {
        this.preuTotal = preuTotal;
    }
    
     public String getRetorna() {
        return "/index";
    }
}