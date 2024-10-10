package com.innovacion.examify.Activity.Entity;

import com.innovacion.examify.Comment.Entity.Comment;
import com.innovacion.examify.Professor.Entity.Professor;
import com.innovacion.examify.Rating.Entity.Rating;
import com.innovacion.examify.Subject.Entity.Subject;
import com.innovacion.examify.Topic.Entity.Topic;
import com.innovacion.examify.Type.Entity.Type;
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
@Document("Activity")
public class Activity {
    @Id
    @Field("_id")
    private ObjectId id;

    @DBRef
    @Field("uploader")
    private User uploader;

    @DBRef
    @Field("subject")
    private Subject subject;

    @DBRef
    @Field("type")
    private Type type;

    @DBRef
    @Field("professor")
    private Professor professor;

    @Field("date")
    private Date date;

    @DBRef
    @Field("topics")
    private List<Topic> topics;

    // TODO Add images, pdf, etc.

    @Field("url")
    private String url;

    @DBRef(lazy = false)
    @Field("ratings")
    private List<Rating> ratings;

    @DBRef(lazy = true)
    @Field("comments")
    private List<Comment> comments;

    @Field("version")
    private byte version;

    @Field("creation_date")
    private Date creationDate;

    @Field("last_modified")
    private Date lastModified;
}
