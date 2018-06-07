package com.sriram.apps.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/ping")
public class Ping {

    @GET
    public Response ping() {
        return Response.status(200).entity("pong").build();
    }
}
