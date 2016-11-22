package com.example.mytest;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;


public class MyTestConfiguration extends Configuration {

    @NotEmpty
    private String name;

    @NotEmpty
    private String defaultAddress = "Madurai";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }
}

