package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController // This annotation make this class to serve as Rest endpoint
@RequestMapping(path = "api/v1/student") // Extended API ROUTES
// All Resources for API
public class StudentController {

    // Class Attribute
    private final StudentService studentService;

    @Autowired
    // Constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping // First Rest Api
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
