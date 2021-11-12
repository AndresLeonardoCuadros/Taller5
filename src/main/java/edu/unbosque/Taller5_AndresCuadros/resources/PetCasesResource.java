package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.PetCase;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/petCases")
public class PetCasesResource {
    List<PetCase> petCases = new ArrayList<PetCase>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        return Response.ok()
                .entity(petCases)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(PetCase petCase){
        if(petCase.getType().equals("lost") ||petCase.getType().equals("stole")
                || petCase.getType().equals("death")){
            petCases.add(petCase);
            return Response.status(Response.Status.CREATED)
                    .entity(petCase)
                    .build();
        }else
            return Response.status(Response.Status.BAD_REQUEST).build();


    }
}
