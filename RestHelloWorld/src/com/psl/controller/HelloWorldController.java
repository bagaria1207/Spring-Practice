package com.psl.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/{firstName}/{lastName}")
	public String sayHello(@PathVariable("firstName")String firstName,
			@PathVariable("lastName")String lastName)
			{
				return "Hello "+" "+firstName+" "+lastName;
			}
	
}
