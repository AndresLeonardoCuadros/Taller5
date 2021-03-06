package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pets/{pet_id}")
public class PetResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("pet_id")Integer pet_id,Pet pet){
        return Response.ok()
                .entity(pet)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("pet_id")Integer pet_id){
        return Response.noContent()
                .build();
    }
}
