package com.example.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.learn.model.Coursemodel;
import com.example.learn.repository.CourseRepo;

@Service
public class CourseService {
    
    @Autowired
    public CourseRepo courseRepo;


    public List<Coursemodel> getting(){
        return courseRepo.findAll();
    }

    public String deleting(int id){
        courseRepo.deleteById(id);
        return "deleted";
    }

    public String posting(Coursemodel course){
        courseRepo.save(course);
        return "course added";
    }

}
