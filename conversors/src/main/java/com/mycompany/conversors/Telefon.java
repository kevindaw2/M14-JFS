/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversors;

/**
 *
 * @author kguina.daw2n
 */
public class Telefon {
    
    private String telefon; 
    
    public Telefon(String telefon){
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    
    public String toString() {
        return telefon;
    }
}