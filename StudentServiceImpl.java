package com.example.alpha.service;

import com.example.alpha.entity.Student;
import com.example.alpha.repositery.StudentRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
  private StudentRepositery studentRepositery;
@Override
    public Student savestudent (Student student)
{
        return studentRepositery.save(student);
    }

    @Override
    public List<Student> fetchstudent() {
        return studentRepositery.findAll();
    }

    public Student fetchbyid(Long ID)
    {
       return studentRepositery.findById(ID).get();
    }

    @Override
    public void deletestudent(Long ID) {
        studentRepositery.deleteById(ID);
    }


}
