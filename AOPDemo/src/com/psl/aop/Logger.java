package com.psl.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logger {
	
	public void go(){
		System.out.println("Go...");
	}
	
	@Before(value = "execution(* com.psl.aop.BankImpl.g*(*))")
	public void logBefore(){
		System.out.println("LogBefore...");
	}
	
	@After(value = "execution(* com.psl.aop.BankImpl.g*(*))")
	public void logAfter(){
		System.out.println("LogAfter...");
	}
	
	@AfterThrowing(value = "execution(* com.psl.aop.BankImpl.g*(*))")
	public void logError(){
		System.out.println("LogError...");
	}
	
	@AfterReturning(value = "execution(* com.psl.aop.BankImpl.g*(*))")
	public void success(){
		System.out.println("Success...");
	}
}
