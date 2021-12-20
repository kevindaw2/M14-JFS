package com.mycompany.conversors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author kguina.daw2n
 */
@FacesConverter("com.mycompany.conversors.TelefonConverter")
public class TelefonConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        StringBuilder telefon = new StringBuilder();

        /*Validacions*/
        if (value.isEmpty()) {
            FacesMessage msg = new FacesMessage("Sense valors", "Vols posar valors, inútil?");
            throw new ConverterException(msg);
        } else {
            telefon.append(value);
        }

    
          char g = value.charAt(2); // devuelve el guion
        String guio = Character.toString(g);

        if ("-".equals(guio)) { //comparar el tercer valor con un guion
            telefon.append(value);
        } else {
            FacesMessage msg = new FacesMessage("Sense format correcte", "El número de telèfon ha de ternir el format: 'pp- nnn nn nn'. És dificil eh?");
            throw new ConverterException(msg);
        }
 
        //el prefix del telefon ha de tenir dos numeros

        Pattern pattern = Pattern.compile("/\\(?([0-9]{2})\\)?([ .-]?)([0-9]{3})\\2([0-9]{4})/");
        Matcher matcher = pattern.matcher(value); 
        
        if(matcher.matches()){
            telefon.append(value); 
        } else {
            FacesMessage msg = new FacesMessage("Sense format correcte", "El número de telèfon ha de ternir 2 pp");
            throw new ConverterException(msg);
        }
  
        //compta si son 7 numeros
        Pattern pat = Pattern.compile("^\\d{7}$");
        Matcher mat = pat.matcher(value); 
 
        if(mat.matches()){
            telefon.append(value);
        } else {
            FacesMessage msg = new FacesMessage("Sense format correcte", "El número de telèfon ha de ternir 7 numeros");
            throw new ConverterException(msg);
        }
        
        //accepta numes numeros 
        
        Pattern patt = Pattern.compile("^[0-9]*$");
        Matcher mattch = patt.matcher(value); 
        
        if(mattch.matches()){
            telefon.append(value); 
        } else {
            FacesMessage msg = new FacesMessage("Sense format correcte", "Només s'admeten números!");
            throw new ConverterException(msg);
        }

        Telefon tel = new Telefon(telefon.toString());
        return tel;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object value) {

        value.toString(); //object to string
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}