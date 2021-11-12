package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.Pet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/pets")
public class PetsResource {
    List<Pet> pets = new ArrayList<Pet>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        return Response.ok()
                .entity(pets)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Pet pet){
        for (int i=0;i < pets.size();i++) {
            if (pet.getMicrochip().equals(pets.get(i).getMicrochip())) {
                return Response.status(Response.Status.BAD_REQUEST).build();
            }else
                pets.add(pet);
        }

        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }
}
