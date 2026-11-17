package com.book.spring_project.lesson55.alt.User;

import org.springframework.stereotype.Component;

public class User {//user
    public String name;
    public User() {
        System.out.println("User bean is created");
        this.name="John Doe";
    }
    public void sayHello() {
        System.out.println("Hello from User bean");
    }
}
