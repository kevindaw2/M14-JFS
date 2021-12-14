package com.mycompany.conversors;

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
        //ha de contar si son numeros 
      
        String str = "^\\s?((\\[1-9]{1,4}[ \\-]*)|(\\([0-9]{2,3}\\)[ \\-]*)|([0-9]{2,4})[ \\-]*)*?[0-9]{3,4}?[ \\-]*[0-9]{3,4}?\\s?";

        if (Pattern.compile(str).matcher(value).matches()) {
            System.out.println("yes");
        } else {
            System.out.println("no");
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
