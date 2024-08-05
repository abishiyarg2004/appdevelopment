package com.example.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.learn.model.Usermodel;

@Repository
public interface UserRepo extends JpaRepository<Usermodel,Integer>{

    

}
