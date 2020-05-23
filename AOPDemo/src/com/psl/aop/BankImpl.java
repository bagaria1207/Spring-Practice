package com.psl.aop;

public class BankImpl implements IBank{
	int balance = 10000;
	@Override
	public void transfer(int creditActNo, int debitActNo, double amt) {
		// TODO Auto-generated method stub
		System.out.println("transfer initiated");
	}

	@Override
	public double getBalance(int accNo) throws ArithmeticException {
		// TODO Auto-generated method stub
		if(balance>0){
			balance-=2000;
		}
		else{
			throw new ArithmeticException("less balance");
		}
		return balance;
	}

	@Override
	public boolean validateCard(int cardNo) {
		// TODO Auto-generated method stub
		System.out.println("card validation completed");
		return true;
	}

}
