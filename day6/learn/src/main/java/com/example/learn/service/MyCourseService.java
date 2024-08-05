package com.example.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.learn.model.MyCoursemodel;
import com.example.learn.repository.MyCourseRepo;

@Service
public class MyCourseService {

    @Autowired
    public MyCourseRepo myCourseRepo;

    public List<MyCoursemodel> getting(){
        return myCourseRepo.findAll();
    }

    public String posting(MyCoursemodel mycourse){
        myCourseRepo.save(mycourse);
        return "my course details posted";
    }

    public String deleting(int id){
        myCourseRepo.deleteById(id);
        return "deleted course details";
    }


}
