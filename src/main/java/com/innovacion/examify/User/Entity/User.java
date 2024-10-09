package com.innovacion.examify.User.Entity;

import com.innovacion.examify.Carrer.Entity.Career;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("User")
public class User {
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("password")
    private String password;

    @Field("semester")
    private byte semester;

    @DBRef
    @Field("career")
    private Career career;

    @Field("version")
    private byte version;

    @Field("creation_date")
    private Date creationDate;

    @Field("last_modified")
    private Date lastModified;
}
