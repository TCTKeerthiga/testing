package com.example.mytest.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by templecity on 14/11/16.
 */
public class RepresentationAPI {
    private int id;
    @Length(max = 3)
    private String value;

    @JsonProperty
    public long getId() {
        return id;
    }
    @JsonProperty
    public String getContent() {
        return value;
    }
    public RepresentationAPI(int id, String value) {
        this.id = id;
        this.value = value;
    }


}
