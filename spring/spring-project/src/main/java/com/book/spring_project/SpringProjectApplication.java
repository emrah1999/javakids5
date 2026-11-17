package com.book.spring_project;

import com.book.spring_project.lesson55.Car;
import com.book.spring_project.lesson55.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args) {
		 SpringApplication.run(SpringProjectApplication.class, args);

		ApplicationContext contexts = SpringApplication.run(SpringProjectApplication.class, args);
		String[] beanNames = contexts.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			Object bean = contexts.getBean(beanName);

			if (bean.getClass().getPackageName().startsWith("com.book")) {
				System.out.println(beanName + " -> " + bean.getClass().getName());
			}
		}
		User user = contexts.getBean(User.class);
		Car car= contexts.getBean(Car.class);
		User user1 = contexts.getBean(User.class);
		System.out.println(user==user1);
		user.sayHello();
		user1.sayHello();
		System.out.println(user1.name);
		System.out.println(user.name);

	}

}
