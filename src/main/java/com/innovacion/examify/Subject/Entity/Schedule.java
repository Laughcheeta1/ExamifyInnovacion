package com.innovacion.examify.Subject.Entity;

import com.innovacion.examify.Professor.Entity.Professor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Field;

public class Schedule {
    @DBRef(lazy = true)
    @Field("professor")
    private Professor professor;

    @Field("time")
    private String time;

    @Field("classroom")
    private String classroom;
}
