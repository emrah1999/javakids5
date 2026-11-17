package com.book.spring_project.lesson55;

import org.springframework.stereotype.Component;

@Component
public class User {
    public String name;
    public User() {
        System.out.println("User bean is created");
        this.name="John Doe";
    }
    public void sayHello() {
        System.out.println("Hello from User bean");
    }

}
