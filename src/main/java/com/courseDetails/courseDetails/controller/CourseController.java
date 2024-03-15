package com.courseDetails.courseDetails.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @GetMapping(value = "/name/{name}")
    public String jenkinDeployStatus(@PathVariable String name){
        return "First Jenkins deployment successful by " + name;
    }

    @GetMapping(value = "/getMobile")
    public String getMobile(@RequestParam String model){
        return "Deployemnt of Mobile package successful" + model;
    }

}
