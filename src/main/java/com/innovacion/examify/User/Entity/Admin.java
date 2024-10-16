package com.innovacion.examify.User.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("Admin")
public class Admin {
    @Id
    @Field("_id")
    private ObjectId id;

    @DBRef(lazy = false)
    @Field("user")
    private User user;

    @Field("creation_date")
    private Date creationDate;

    @DBRef(lazy = true)
    @Field("created_by")
    private User createdBy;
}
