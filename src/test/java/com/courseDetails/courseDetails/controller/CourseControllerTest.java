package com.courseDetails.courseDetails.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseControllerTest {

    @InjectMocks
    private CourseController courseController;

    @Test
    public void jenkinDeployStatusTest(){
       String message = Mockito.when(courseController.jenkinDeployStatus("test"))
                .thenReturn("deployed successsful").toString();
        Assertions.assertEquals(message, "deployed successsful");
    }

}
