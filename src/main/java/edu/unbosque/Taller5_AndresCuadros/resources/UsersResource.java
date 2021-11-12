package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UsersResource {
    List<User> users = new ArrayList<User>();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){

        return Response.ok()
                .entity(users)
                .build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(User user){
        users.add(user);
        return Response.status(Response.Status.CREATED)
                .entity(user)
                .build();
    }

}
