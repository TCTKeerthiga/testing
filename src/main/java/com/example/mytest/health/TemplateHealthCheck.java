package com.example.mytest.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by templecity on 14/11/16.
 */
public class TemplateHealthCheck extends HealthCheck{
    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String name = String.format(template,"TEST");
        if (!name.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
