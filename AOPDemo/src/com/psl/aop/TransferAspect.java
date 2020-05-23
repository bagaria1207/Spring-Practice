package com.psl.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TransferAspect {
	
	@Around(value = "execution(* com.psl.aop.BankImpl.transfer(int,int,double)) and args(creditActNo, debitActNo, amt)")
	public void transferTransaction(ProceedingJoinPoint jp, int creditActNo, int debitActNo, double amt){
		System.out.println("transferTransaction....before");
		try{
			jp.proceed();
		}
		catch(Throwable e){
			e.printStackTrace();
		}
		System.out.println("transferTransaction....after");
	}
}
