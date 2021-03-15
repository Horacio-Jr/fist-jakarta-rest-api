/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.horaciojunior.fist.jakarta.rest.api.resourses;

import com.horaciojunior.fist.jakarta.rest.api.dao.NumerosDAO;
import com.horaciojunior.fist.jakarta.rest.api.model.Numeros;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author PCDEV
 */
@Path("fist")
public class FistResource {

    @Inject
    private NumerosDAO nbrRepo;

    @POST
    @Path("/random")
    @Produces("application/json")
    public Response randomNumber() {

        SecureRandom rbnumber = new SecureRandom();
        Long generatedNumber = Long.valueOf(10000 + rbnumber.nextInt(99999));
        nbrRepo.add(generatedNumber, generatedNumber);

        return Response.ok(generatedNumber).build();
    }

    @GET
    @Path("/history")
    @Produces("application/json")
    public ArrayList<Numeros> findAllNumbers() {
        return (ArrayList<Numeros>) nbrRepo.findAll();
    }

  
}
