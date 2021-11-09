/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author kguina.daw2n
 */
@Named(value = "calculadora")
@SessionScoped
public class Calculadora implements Serializable {
    
    private int [] numeros; 

    private int solucio;
    private String [] operacio; 

    public String[] getOperacio() {
        return operacio;
    }

    public void setOperacio(String[] operacio) {
        this.operacio = operacio;
    }
    
    public Calculadora(int [] numeros, int solucio, String [] operacio) {
        this.numeros = numeros; 
        this.solucio = solucio; 
        this.operacio = operacio; 
    }
    
    public int[] getNumeros(){
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
 
    public int getSolucio() {
        return solucio;
    }

    public void setSolucio(int solucio) {
        this.solucio = solucio;
    }
}