package com.example.mytest.resources;

import com.codahale.metrics.annotation.Timed;
import com.example.mytest.api.RepresentationAPI;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by templecity on 14/11/16.
 */
@Path("/my-test")
@Produces(MediaType.APPLICATION_JSON)
public class MyTestResource {
    private final String name;
    private final AtomicLong counter;

    public MyTestResource(String name) {
        this.name = name;
        this.counter = new AtomicLong();
    }
    @GET
    @Timed
    public RepresentationAPI sayHello(@QueryParam("param") String param) {
        final String value = String.format(name,param);
        return new RepresentationAPI((int)counter.incrementAndGet(),value);
    }
}