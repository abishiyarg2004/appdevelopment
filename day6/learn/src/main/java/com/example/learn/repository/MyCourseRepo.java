package com.example.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learn.model.MyCoursemodel;

public interface MyCourseRepo extends JpaRepository<MyCoursemodel,Integer>{

}
