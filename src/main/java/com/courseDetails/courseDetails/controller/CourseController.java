package com.courseDetails.courseDetails.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Locale;


@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @GetMapping(value = "/name/{name}")
    public String jenkinDeployStatus(@PathVariable String name){
        return "First Jenkins deployment successful by " + name;
    }

    @PostMapping(value = "/saveAll")
    public String saveAll(@RequestBody String name, @RequestHeader String countryCode){
        return "All records saved for country "+countryCode+ "  by "+ name;
    }

}
