package com.annotations;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	public void whatsYourName()
	{
		System.out.println("My name is Ram");
	}
}
