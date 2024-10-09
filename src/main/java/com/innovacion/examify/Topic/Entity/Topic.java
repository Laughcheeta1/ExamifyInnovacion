package com.innovacion.examify.Topic.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

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

    @Field("created_by")
    private String createdBy;
}
