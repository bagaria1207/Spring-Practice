package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.psl.bean.Employee;

@Aspect
public class InsertAspect {

	@Around("execution (* com.psl.dao.EmployeeDao.insertEmployee(..))")
	public void insertBean(ProceedingJoinPoint jp)
	{	
		System.out.println("insertBean....before");
		try{
			jp.proceed();
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("insertBean....after");
	}
}
