package com.example.learn.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Quizmodel {
    

    @Id
    private int id;

    @JsonBackReference
    @OneToOne
    private MyCoursemodel myCoursemodel;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "quizmodel")
    private List<Questionsmodel> questions;


}
