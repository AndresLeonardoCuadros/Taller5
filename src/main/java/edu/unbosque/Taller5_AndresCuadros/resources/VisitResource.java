package edu.unbosque.Taller5_AndresCuadros.resources;


import edu.unbosque.Taller5_AndresCuadros.resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/visits/{visit_id}")
public class VisitResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("visit_id")Integer visit_id, Visit visit){
        return  Response.ok()
                .entity(visit)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("visit_id")Integer visit_id){
        return Response.noContent()
                .build();
    }
}
