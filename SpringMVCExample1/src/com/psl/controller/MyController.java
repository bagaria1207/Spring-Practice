package com.psl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("hello")
	public ModelAndView sayHello(){
//		 name of view -> hello
//		 model -> "Hello All"
//		 using msg we can use Hello All on hello.jsp 
		return new ModelAndView("hello","msg","Hello All");
	}
	
	@RequestMapping("welcome")
	public ModelAndView sayWelcome(){
		return new ModelAndView("welcome","message","Welcome All");
	}
}
