package com.example;

public abstract class Account {
public abstract void getDescription();
public abstract Boolean withdraw(double amount); 
protected double balance;
public Account(double balance)
{
	this.balance = balance;
}

}
