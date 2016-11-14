package com.example.mytest.resources;

import com.codahale.metrics.annotation.Timed;
import com.example.mytest.api.RepresentationAPI;
import com.google.common.base.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by templecity on 14/11/16.
 */
@Path("MyTest")
@Produces(MediaType.APPLICATION_JSON)
public class MyTestResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public String getTemplate() {
        return template;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public AtomicLong getCounter() {
        return counter;
    }

    public MyTestResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public RepresentationAPI createMyTest(@QueryParam("name") String name) {
        final String value = String.format(template, name.compareToIgnoreCase(defaultName));
        return new RepresentationAPI((int) counter.incrementAndGet(), value);
    }
}
