package com.example.mytest;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class MyTestConfiguration extends Configuration {
    @NotEmpty
    private String name;
    @NotEmpty
    private String adrs = "mdu";

    @JsonProperty
    public String getName() {
        return name;
    }
    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }
    @JsonProperty
    public String getAdrs() {
        return adrs;
    }
    @JsonProperty
    public void setAdrs(String adrs) {
        this.adrs = adrs;
    }
}

