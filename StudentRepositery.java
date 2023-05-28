package com.example.alpha.repositery;

import com.example.alpha.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositery extends JpaRepository<Student,Long> {

}
