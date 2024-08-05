package com.example.learn.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Coursemodel {
    
    @Id
    private int id;

    private String title;
    private String description;
    private String duration;
    private String image;
    private boolean enrolled;


    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "coursemodel")
    private MyCoursemodel myCoursemodel;

}
