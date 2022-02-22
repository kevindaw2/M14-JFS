/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercici35;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Locale;
import javax.faces.context.FacesContext;

/**
 *
 * @author Kevin
 */
@Named(value = "languageController")
@SessionScoped
public class languageController implements Serializable {
    
    private Locale locale = new Locale("en", "US");
    private String dflt = "Hola el meu nom es Emoji, i el teu?"; 

    public String getDflt() {
        return dflt;
    }

    public void setDflt(String dflt) {
        this.dflt = dflt;
    }
 
    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
    
    public languageController() {
    }
    
    public void change(String lang) {
        String [] lc = lang.split("-"); 
        this.locale = new Locale(lc[0], lc[1]);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(this.locale); 
        
    }
    
}