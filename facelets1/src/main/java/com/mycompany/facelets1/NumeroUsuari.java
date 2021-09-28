/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facelets1;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author kguina.daw2n
 */
@Named
@SessionScoped
public class NumeroUsuari implements Serializable {

    /**
     * Creates a new instance of NumeroUsuari
     */
    private static final long serialVersionUID = 5443351151396868724L;
    private Integer randomInt = null;
    private Integer numUsuari = null;
    private String resposta = null;
    private int maxim = 10;
    private int minim = 0;

    public NumeroUsuari() {
        Random randomGR = new Random();
        randomInt = new Integer(randomGR.nextInt(maxim + 1));
        System.out.println("Número: " + randomInt);
    }

    public Integer getRandomInt() {
        return randomInt;
    }

    public void setRandomInt() {
        this.randomInt = randomInt;
    }

    public Integer getNumUsuari() {
        return numUsuari;
    }

    public void setNumUsuari(Integer numUsuari) {
        this.numUsuari = numUsuari;
    }

    public String getResposta() {
        if ((numUsuari == null) || (numUsuari.compareTo(randomInt) != 0)) {
            return "Noi, " + numUsuari + " es incorrecte.";
        } else {
            return "Molt bé!";
        }
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public int getMaxim() {
        return maxim;
    }

    public void setMaxim(int maxim) {
        this.maxim = maxim;
    }

    public int getMinim() {
        return minim;
    }

    public void setMinim(int minim) {
        this.minim = minim;
    }
}