/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercici12;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Kevin
 */
@Named(value = "classe")
@SessionScoped
public class Classe implements Serializable {
    
    private Alumne al [] = {
        new Alumne ("Pepe", "Garcia", new int []{3,4,2}), 
        new Alumne ("Jhon", "Perez", new int []{7,8,2}),
        new Alumne("Aniceta", "Canela", new int []{10,10,10})}; 

    public Classe() {
    }

    public Alumne[] getAl() {
        return al;
    }

    public void setAl(Alumne[] al) {
        this.al = al;
    }  
}
