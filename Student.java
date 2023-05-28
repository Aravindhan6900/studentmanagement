package com.example.alpha.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String studentname;
    private long studentmobile;
    private String studentaddress;
    public Student()
    {

    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", studentname='" + studentname + '\'' +
                ", studentmobile=" + studentmobile +
                ", studentaddress='" + studentaddress + '\'' +
                '}';
    }

    public Student(Long ID, String studentname, long studentmobile, String studentaddress) {
        this.ID = ID;
        this.studentname = studentname;
        this.studentmobile = studentmobile;
        this.studentaddress = studentaddress;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public long getStudentmobile() {
        return studentmobile;
    }

    public void setStudentmobile(long studentmobile) {
        this.studentmobile = studentmobile;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }
}
