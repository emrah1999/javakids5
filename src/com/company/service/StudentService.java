package com.company.service;

import com.company.model.Student;

public class StudentService {
    public String getStudentData() {
        Student student = new Student("John", "Doe");
        return student.getInfo();
    }
}
