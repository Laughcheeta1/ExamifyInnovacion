package com.innovacion.examify.Type.Entity;

import com.innovacion.examify.User.Entity.User;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("Type")
public class Type {
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("version")
    private byte version;

    @Field("last_modified")
    private Date lastModified;

    @Field("creation_date")
    private Date creationDate;

    @DBRef(lazy = true)
    @Field("created_by")
    private User createdBy;
}
