package com.train.utils;

public class Account {


	private double balance;
	private double interest;
	

	public Account()
	{
		balance = 0;
		interest = 0;
	}

	public Account(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		if((balance - amount ) <= -1) {
			System.out.println("InSufficient Balance");
			return ;
		}
			
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}
