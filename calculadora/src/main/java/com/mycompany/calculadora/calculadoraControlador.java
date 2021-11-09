/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;

/**
 *
 * @author kguina.daw2n
 */
@Named(value = "calculadoraControlador")
@SessionScoped

public class calculadoraControlador implements Serializable {
    
    private boolean novaOp; 
    private boolean seleccionarOp; 
    
    @Inject 
    private Calculadora numeros; 
    
    public boolean isNovaOp() {
        return novaOp;
    }
    
    public void calcular(){
      
        int [] numerosIntroducidos = numeros.getNumeros(); 
        
        for (int num : numerosIntroducidos){
            
            numeros.setSolucio(num + num); 
        }
        
        numeros.getNumeros();
        numeros.getOperacio();
        numeros.setSolucio(2);
    }
    
    public void canviarOperacio(){
    }
    
    public void seleccionarOperacio(){
    }
    public void setNovaOp(boolean novaOp) {
        this.novaOp = novaOp;
    }

    public boolean isSeleccionarOp() {
        return seleccionarOp;
    }

    public void setSeleccionarOp(boolean seleccionarOp) {
        this.seleccionarOp = seleccionarOp;
    }
    
    public calculadoraControlador() {
    }
    
}