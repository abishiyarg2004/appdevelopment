package com.example.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learn.model.Quizmodel;

public interface QuizRepo extends JpaRepository<Quizmodel,Integer> {

}
