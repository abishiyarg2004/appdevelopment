package com.example.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learn.model.Questionsmodel;

public interface QuestionsRepo extends JpaRepository<Questionsmodel,Integer> {

}
