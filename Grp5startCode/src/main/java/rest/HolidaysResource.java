/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dtos.PublicHolidaysDTO;
import facades.DataFetcherFacade;
import java.io.IOException;
import java.util.Collection;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Nicol
 */
@Path("holidays")
public class HolidaysResource {

    @Context
    private UriInfo context;
    private static final DataFetcherFacade FACADE = new DataFetcherFacade();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Creates a new instance of HolidaysResource
     */
    public HolidaysResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHolidays() throws IOException {

        Collection<PublicHolidaysDTO> h = FACADE.getPublicHolidaysDTO();
        String daily = GSON.toJson(h);
        return daily;
    }
}
