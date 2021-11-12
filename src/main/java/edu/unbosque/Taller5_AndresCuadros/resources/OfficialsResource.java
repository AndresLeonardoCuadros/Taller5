package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.Official;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/officials")
public class OfficialsResource {
    List<Official> officials = new ArrayList<Official>();
    int i =officials.size();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        return Response.ok()
                .entity(officials)
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Official official){
        i++;
        official.setPerson_id(i);
        officials.add(official);
        return Response.status(Response.Status.CREATED)
                .entity(official)
                .build();
    }
}
