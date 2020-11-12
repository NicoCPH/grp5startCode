/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import facades.PetsFacade;
import javax.annotation.security.RolesAllowed;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import security.errorhandling.AuthenticationException;
import utils.EMF_Creator;

/**
 * REST Web Service
 *
 * @author Nicol
 */
@Path("pets")
public class PetsResource {

    @Context
    private UriInfo context;
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();

    private static final PetsFacade FACADE = PetsFacade.getPetsFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    /**
     * Creates a new instance of PetsResource
     */
    public PetsResource() {
    }

    /**
     * Retrieves representation of an instance of rest.PetsResource
     * @return an instance of java.lang.String
     * @throws security.errorhandling.AuthenticationException
     */
    @GET
    @RolesAllowed("user")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPets() throws AuthenticationException {
     return Response.ok().entity(GSON.toJson(FACADE.getPets())).build();
    }

    
    
    /**
     * PUT method for updating or creating an instance of PetsResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
