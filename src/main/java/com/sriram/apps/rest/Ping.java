package com.sriram.apps.rest;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Slf4j
@Path("/ping")
public class Ping {

    @GET
    public Response ping() {
        log.debug("ping");
        return Response.status(200).entity("pong").build();
    }
}
