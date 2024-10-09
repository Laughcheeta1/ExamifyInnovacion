package com.innovacion.examify.Rating.Entity;

import com.innovacion.examify.User.Entity.User;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Data
@Document("Rating")
public class Rating {
    @Id
    @Field("_id")
    private ObjectId id;

    @DBRef(lazy = true)
    @Field("user")
    private User user;

    @Field("is_like")
    private boolean isLike;

    @Field("version")
    private byte version;

    @Field("last_modified")
    private Date lastModified;

    @Field("creation_date")
    private Date creationDate;
}
