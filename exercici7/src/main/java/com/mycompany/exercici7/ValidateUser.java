/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercici7;

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
public class ValidateUser implements Serializable {

    private String username;
    private String password;

    public ValidateUser() {}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        
        return "validacio.xhtml";
        /*
        1- crear map 
        2- if else 
        
        Map <String, ValidateUser> validacioUsuaris = new TreeMap<String, JugadorSeleccion>();
        validacioUsuaris.put(1, "Casillas");
        validacioUsuaris.put(1, "Casillas");
        validacioUsuaris.put(1, "Casillas");
        validacioUsuaris.put(1, "Casillas");
        validacioUsuaris.put(1, "Casillas");
 
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }
        */
    }

    public PropertyChangeSupport getPropertySupport() {
        return propertySupport;
    }

    public void setPropertySupport(PropertyChangeSupport propertySupport) {
        this.propertySupport = propertySupport;
    }

    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";

    private String sampleProperty;

    private PropertyChangeSupport propertySupport;

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