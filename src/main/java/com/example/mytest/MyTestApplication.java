package com.example.mytest;

import com.example.mytest.health.TemplateHealthCheck;
import com.example.mytest.resources.MyTestResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyTestApplication extends Application<MyTestConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MyTestApplication().run(args);
    }

    @Override
    public String getName() {
        return "my-test";
    }

    @Override
    public void initialize(final Bootstrap<MyTestConfiguration> bootstrap) {
        // TODO: application initialization
    }
    @Override
    public void run(final MyTestConfiguration configuration,
                    final Environment environment) {
        final MyTestResource resource = new MyTestResource(configuration.getName());
        
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getName());
        
        environment.healthChecks().register("name", healthCheck);
        environment.jersey().register(resource);
    }
}
