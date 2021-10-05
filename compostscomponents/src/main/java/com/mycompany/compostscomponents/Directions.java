/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.compostscomponents;

import java.beans.*;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author kguina.daw2n
 */

@Named
@SessionScoped
public class Directions implements Serializable {
    
    
    private final String adreca1 = null; 
    private String adreca2 = null; 

    public String getAdreca2() {
        return adreca2;
    }

    public void setAdreca2(String adreca2) {
        this.adreca2 = adreca2;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodipostal() {
        return codipostal;
    }

    public void setCodipostal(String codipostal) {
        this.codipostal = codipostal;
    }

    public String getTipusdadreca() {
        return tipusdadreca;
    }

    public void setTipusdadreca(String tipusdadreca) {
        this.tipusdadreca = tipusdadreca;
    }

    public PropertyChangeSupport getPropertySupport() {
        return propertySupport;
    }

    public void setPropertySupport(PropertyChangeSupport propertySupport) {
        this.propertySupport = propertySupport;
    }
    private String ciutat = null; 
    private String pais = null; 
    private String codipostal = null; 
    private String tipusdadreca = null; 
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public Directions() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
