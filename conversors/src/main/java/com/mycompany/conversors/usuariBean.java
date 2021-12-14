/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.conversors;

import java.io.Serializable;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

/**
 *
 * @author kguina.daw2n
 */

@Named(value = "usuariBean")
@Dependent

public class usuariBean implements Serializable {

   public Telefon tlf;
   public String nom; 

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
  
   public Telefon getTlf() {
      return tlf;
   }

   public void setTlf(Telefon tlf) {
      this.tlf = tlf;
   }	
}