package com.example.mytest.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by templecity on 14/11/16.
 */
public class RepresentationAPI {
    private int id;
    @Length(max = 10)
    private String content;

    public RepresentationAPI() {

    }

    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

    public RepresentationAPI(int id, String content) {
        this.id = id;
        this.content = content;
    }
}