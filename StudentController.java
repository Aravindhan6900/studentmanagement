package com.example.alpha.controller;

import com.example.alpha.entity.Student;
import com.example.alpha.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student savestudent(@RequestBody Student student) {
        return studentService.savestudent(student);
    }

    @GetMapping("/student")
    public List<Student> fetchstudent() {
        return studentService.fetchstudent();
    }
    @GetMapping("/student/{id}")
    public Student fetchbyid(@PathVariable("ID") Long ID)
    {
        return studentService.fetchbyid(ID);
    }
    @DeleteMapping("/student/{id}")
    public String deletestudent(@PathVariable("ID") Long ID)
    {
       studentService.deletestudent(ID);
        return "deleted sucessfull";
    }


}




