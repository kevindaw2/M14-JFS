/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.simple.flow;

import java.io.Serializable;
import javax.inject.Named;
import javax.faces.flow.FlowScoped;

/**
 *
 * @author kguina.daw2n
 */
@Named
@FlowScoped("correuFlowBean")
public class correuFlowBean implements Serializable {
    

    public String getRetorna() {
        return "/index";
    }

    public correuFlowBean() {
    }
    
}