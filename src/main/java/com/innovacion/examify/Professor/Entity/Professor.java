package com.innovacion.examify.Professor.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document("Professor")
@Data
public class Professor {
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("email")
    private String email;

    @Field("description")
    private String description;

    @Field("schedule")
    private String schedule;

    @Field("extra_info")
    private List<ExtraInfo> extraInfo;

    @Field("version")
    private byte version;

    @Field("creation_date")
    private Date creationDate;

    @Field("last_modified")
    private Date lastModified;
}
