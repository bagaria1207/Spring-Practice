package com.psl.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Logger {
		
	public void go(){
		System.out.println("Go...");
	}
	
	public void logBefore(){
		System.out.println("LogBefore...");
	}
	
	public void logAfter(){
		System.out.println("LogAfter...");
	}
	
	public void logError(){
		System.out.println("LogError...");
	}
	
	@AfterReturning(value = "execution(* com.psl.dao.EmployeeDao.f*())")
	public void success(){
		System.out.println("Success...");
	}
}
