package com.innovacion.examify.Topic.Entity;

import com.innovacion.examify.User.Entity.User;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("Topic")
public class Topic {
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("version")
    private byte version;

    @Field("last_update")
    private Date lastUpdate;

    @Field("creation_date")
    private Date creationDate;

    @DBRef
    @Field("created_by")
    private User createdBy;
}
