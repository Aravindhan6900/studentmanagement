package com.example.alpha.service;

import com.example.alpha.entity.Student;

import java.util.List;
import java.util.Optional;


public interface StudentService {
    public  Student savestudent(Student student);

    List<Student> fetchstudent();
    public Student fetchbyid(Long ID);

   public  void  deletestudent(Long ID);
}





