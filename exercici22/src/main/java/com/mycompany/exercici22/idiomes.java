/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercici22;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author kguina.daw2n
 */
@Named(value = "idiomes")
@SessionScoped
public class idiomes implements Serializable {
    
    private Map <String, String> data; 
    private Map <String, String> colors; 
    
    private String idioma = "Bon dia nois"; 
    private String color = "#fff"; 

    /**
     * Creates a new instance of idiomes
     */
    public idiomes() {
        
        data = new LinkedHashMap<String, String>(); 
        data.put("Català", "Bon dia nois"); 
        data.put("English", "Good morning boys"); 
        data.put("Françes", "Bonjour les gars"); 
        data.put("Alemany", "Guten morgen leute"); 
        
        colors = new LinkedHashMap<String, String>(); 
        colors.put("Green", "#2ecc71");
        colors.put("Blue", " #3498db");
        colors.put("Red", "#e01414");
        colors.put("Yellow", " #f4d03f");
        
    }
    
    public Map<String, String> getData(){
        return data; 
    }
    
    public Map<String, String> getColors() {
        return colors; 
    }
    
    public void setColors(Map<String, String> colorsN) {
        colors = colorsN; 
    }
    
    public void setData(Map<String, String> dataN) {
        data = dataN; 
    }
    
    public String getIdioma() {
        return idioma; 
    }
    
    public void setIdioma(String idioma) {
        this.idioma = idioma; 
    }
    
    public void canviIdioma(ValueChangeEvent event) {
        idioma = event.getNewValue().toString(); 
    }
    
    public void canviColor(ValueChangeEvent event) {
        color = event.getNewValue().toString();
    }
      
}