package com.learingspringboot.learingspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    // Mapping a URL to this List
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"learn aws", "stephen marek"),
                new Course(2, "Learn Spring Boot", "In28mins")
        );
    }

    public static void main(String[] args) {

    }
}
