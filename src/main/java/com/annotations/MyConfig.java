package com.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan({"com.pack"})
public class MyConfig {

	@Bean("student1")
	
	public Student getStudent()
	{
		System.out.println("Creating first student object");
		return new Student();
	}
	
	@Bean("student2")
	@Lazy
	public Student createStudent()
	{
		System.out.println("Creating second student object");
		return new Student();
	}
}
