package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.Vet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("vets")
public class VetsResource {
    List<Vet> vets = new ArrayList<Vet>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        return Response.ok().entity(vets).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Vet vet){
        vets.add(vet);
        return Response.status(Response.Status.CREATED)
                .entity(vet)
                .build();
    }
}
