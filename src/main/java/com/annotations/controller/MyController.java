package com.annotations.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value = "/home",method = RequestMethod.GET)
	@ResponseBody
	public String home()
	{
		System.out.println("This is home page");
		return "This is my name";
	}
	
	@RequestMapping(value = "/home/{userid}",method = RequestMethod.GET)
	public String user(@PathVariable("userid") Integer userId)
	{
		return String.valueOf(userId);
	}
}
