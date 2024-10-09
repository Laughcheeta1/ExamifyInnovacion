package com.innovacion.examify.User.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document("Admin")
public class Admin {
    @Id
    @Field("_id")
    private ObjectId id;

    @DBRef
    @Field("user")
    private User user;

    @Field("creation_date")
    private Date creationDate;

    @DBRef
    @Field("created_by")
    private User createdBy;
}
