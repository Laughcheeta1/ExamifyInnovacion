package com.innovacion.examify.Comment.Entity;

import com.innovacion.examify.Rating.Entity.Rating;
import com.innovacion.examify.User.Entity.User;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Data
@Document("Comment")
public class Comment {
    @Id
    @Field("_id")
    private ObjectId id;

    @DBRef
    @Field("user")
    private User user;

    @Field("comment")
    private String comment;

    @Field("date_time")
    private Date dateTime;

    @DBRef
    @Field("ratings")
    private List<Rating> ratings;
}
