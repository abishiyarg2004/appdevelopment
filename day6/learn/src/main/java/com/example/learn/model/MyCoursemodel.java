package com.example.learn.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class MyCoursemodel {

    @Id
    private int id;
    private String title;
    private String description;
    private String image;
    private String authorName;
    private String authorRole;
    private String duration;
    private String level;
    private String price;
    private String provider;
    private String expiresOn;
    private String language;
    private String quizDuration;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    private Coursemodel coursemodel;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "myCoursemodel")
    private Quizmodel quiz;


}
