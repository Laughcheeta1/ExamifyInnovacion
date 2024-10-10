package com.innovacion.examify.Professor.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.mongodb.core.mapping.Field;

public class ExtraInfo {
    @JsonProperty("name")
    @Field("name")
    private String name;
    @JsonProperty("description")
    @Field("description")
    private String description;
}
