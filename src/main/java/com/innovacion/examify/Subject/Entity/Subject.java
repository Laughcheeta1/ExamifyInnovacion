package com.innovacion.examify.Subject.Entity;


import com.innovacion.examify.Carrer.Entity.Career;
import com.innovacion.examify.Professor.Entity.Professor;
import com.innovacion.examify.Topic.Entity.Topic;
import com.innovacion.examify.User.Entity.Admin;
import com.innovacion.examify.User.Entity.User;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document("Subject")
@Data
public class Subject {
    @Id
    @Field("_id")
    private ObjectId id;

    @Field("name")
    private String name;

    @Field("careers_it_belongs")
    private List<Career> careersItBelongs;

    @Field("description")
    private String description;

    @DBRef
    @Field("Topics")
    private List<Topic> topics;

    @DBRef
    @Field("schedules")
    private List<Schedule> schedules;

    @DBRef
    @Field("historic_professors")
    private List<Professor> historicProfessors;

    @Field("version")
    private byte version;

    @Field("creation_date")
    private Date creationDate;

    @Field("last_modified")
    private Date lastModified;

    @DBRef
    @Field("created_by")
    private Admin createdBy;
}
