package com.example.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learn.model.Coursemodel;
import com.example.learn.service.CourseService;

import jakarta.websocket.server.PathParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    public CourseService courseService;

    @GetMapping("/getting")
    public List<Coursemodel> getting() {
        return courseService.getting();
    }
    
    @PostMapping("/posting")
    public String posting(@RequestBody Coursemodel course) {
        
        
        return courseService.posting(course);
    }
    
    @DeleteMapping("/deleting/{id}")
    public String deleting(@PathVariable int id){
        return courseService.deleting(id);
    }

    
}
