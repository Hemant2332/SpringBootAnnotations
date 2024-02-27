package com.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pack.Dog;

@SpringBootApplication
public class SpringBootAnnotationsApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("student1")
	private Student student;
	
	@Autowired
	private Employee employee;
	
	@Autowired
	private Dog dog;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		student.studying();
		employee.whatsYourName();
		dog.eating();
		
	}

}
