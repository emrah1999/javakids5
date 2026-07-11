package com.company.main;

import com.company.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        String studentData = studentService.getStudentData();
        System.out.println(studentData);
    }
}
