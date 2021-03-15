/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horaciojunior.fist.jakarta.rest.api.model;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author PCDEV
 */

@SessionScoped
public class Numeros implements Serializable{
    
    private long generatedTime;
    private long generatedNumber;
    
    public Numeros(long generatedTime, long generatedNumber){
        this.generatedTime = generatedTime;
        this.generatedNumber = generatedNumber;
    }

    /**
     * @return the generatedTime
     */
    public long getGeneratedTime() {
        return generatedTime;
    }

    /**
     * @param generatedTime the generatedTime to set
     */
    public void setGeneratedTime(long generatedTime) {
        this.generatedTime = generatedTime;
    }

    /**
     * @return the generatedNumber
     */
    public long getGeneratedNumber() {
        return generatedNumber;
    }

    /**
     * @param generatedNumber the generatedNumber to set
     */
    public void setGeneratedNumber(long generatedNumber) {
        this.generatedNumber = generatedNumber;
    }
    
    
}
