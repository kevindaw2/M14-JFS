/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author kguina.daw2n
 */
@Named(value = "navegacioBean")
@SessionScoped
public class NavegacioBean implements Serializable {

    /**
     * Creates a new instance of NavegacioBean
     */
    public NavegacioBean() {
    }

    public String saludar() {

        int hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if ((hora >= 00) && (hora <= 12)) {
            return "mati";
        } else if ((hora >= 12) && (hora <= 19)) {
            return "tarda";
        } else {
            return "nit";
        }
    }
}