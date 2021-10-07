package com.ssu.kuzmin.task2;

import di.AppConfig;
import entities.Appointment;
import entities.MedicalCard;
import entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.UserService;

@SpringBootApplication
public class Task2Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Task2Application.class, args);
		var config = new AnnotationConfigApplicationContext(AppConfig.class);
		String[] springComponents = config.getBeanDefinitionNames();

		var userService = config.getBean(UserService.class);
		var users1 = userService.getAll();

		userService.add(new User(2, "John", "John", "John", "John@hosp.com", "123", "John"));
		var users2 = userService.getAll();
		userService.update(new User(2, "Max", "Max", "Max", "Max@hosp.com", "123", "Max"));
		var users3 = userService.getAll();
		userService.delete(2);
		var users4 = userService.getAll();
	}
}
