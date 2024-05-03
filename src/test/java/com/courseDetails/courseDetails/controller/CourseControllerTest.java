package com.courseDetails.courseDetails.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@SpringBootTest
public class CourseControllerTest {

    @InjectMocks
    private CourseController courseController;

    @Mock
    private HttpServletRequest httpServlet;

    @Test
    public void jenkinDeployStatusTest(){
       String actualMessage = "First Jenkins deployment successful by John";
       Mockito.when(httpServlet.getRequestURI()).thenReturn("/name");
       String expextedoutput = courseController.jenkinDeployStatus("John");
       Assertions.assertEquals(actualMessage, expextedoutput);
    }

    @Test
    public void saveAllApi(){
        String actualMessage = "All records saved for country IN  by John";
        Mockito.when(httpServlet.getRequestURI()).thenReturn("/saveAll");
        String exOp = courseController.saveAll("John","IN");
        Assertions.assertEquals(actualMessage, exOp);
    }

}
