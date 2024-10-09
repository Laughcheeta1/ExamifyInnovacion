package com.innovacion.examify.Carrer.Entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("Career")
public class Career {
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("version")
    private byte version;

    @Field("created_at")
    private Date createdAt;
}
