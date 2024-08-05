package com.example.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learn.model.Coursemodel;

@Repository
public interface CourseRepo extends JpaRepository<Coursemodel,Integer> {

}
