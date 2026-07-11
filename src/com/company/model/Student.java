package com.company.model;

public class Student {
    String name;
    String surname;
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getInfo(){
        return "Name: " + name + ", Surname: " + surname;
    }


}
