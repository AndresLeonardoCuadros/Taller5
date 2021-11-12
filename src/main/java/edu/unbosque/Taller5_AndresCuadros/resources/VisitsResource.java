package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.Visit;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/visits")
public class VisitsResource {

    List<Visit> visits = new ArrayList<Visit>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){

        return Response.ok()
                .entity(visits)
                .build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Visit visit){
        if(visit.getType().equals("sterilization") ||visit.getType().equals("microchip implantation")
                || visit.getType().equals("vaccination")|| visit.getType().equals("deworming")
                || visit.getType().equals("urgency")|| visit.getType().equals("check")){
            visits.add(visit);
            return Response.status(Response.Status.CREATED)
                    .entity(visit)
                    .build();
        }else
            return Response.status(Response.Status.BAD_REQUEST).build();
    }
}
