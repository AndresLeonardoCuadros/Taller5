package edu.unbosque.Taller5_AndresCuadros.resources;

import edu.unbosque.Taller5_AndresCuadros.resources.pojos.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users/{username}")
public class UserResource {

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response modify(@PathParam("username")String username, User user){
        return  Response.ok()
                .entity(user)
                .build();
    }

    @DELETE
    public Response delete(@PathParam("username")String username){
        return Response.noContent()
                .build();
    }
}
