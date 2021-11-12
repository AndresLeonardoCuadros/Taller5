package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.PetCase;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/petCases/{case_id}")
public class PetCaseResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("case_id")Integer case_id, PetCase petCase){
        return Response.ok()
                .entity(petCase)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("case_id")Integer case_id){
        return Response.noContent()
                .build();
     }
}
