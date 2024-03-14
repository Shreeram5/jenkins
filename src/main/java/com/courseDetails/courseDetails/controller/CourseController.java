package com.courseDetails.courseDetails.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @GetMapping(value = "/name")
    public String jenkinDeployStatus(@PathVariable String name){
        return "First Jenkins deployment successful by " + name;
    }

}
