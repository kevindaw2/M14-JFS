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
@Named(value = "alumne")
@SessionScoped
public class Alumne implements Serializable {
    private String nom; 
    private String cognom;
    private int [] notes; 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int[] getNotes() {
        return notes;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }
    
    /**
     * Creates a new instance of Alumne
     */
    public Alumne(String nom, String cognom, int [] notes) {
        this.nom = nom; 
        this.cognom = cognom; 
        this.notes = notes; 
    }
    
}
