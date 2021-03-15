/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horaciojunior.fist.jakarta.rest.api.dao;

import com.horaciojunior.fist.jakarta.rest.api.model.Numeros;
import java.util.ArrayList;

import java.util.List;


/**
 *
 * @author PCDEV
 */
public class NumerosDAO {
    
    public List<Numeros> numeros = new ArrayList<>();

    public void add(long generatedTime, long generatedNumber) {
        numeros.add(new Numeros(generatedTime, generatedNumber));
    }

    public List<Numeros> findAll() {
        return numeros;
    }
}
