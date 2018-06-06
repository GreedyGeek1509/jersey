package com.sriram.apps.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class RestService {
    @GET
    @Path("/{name}")
    public Response getMessage(@PathParam("name") String name) {
        return Response.status(200).entity("Hello "+name).build();
    }
}
