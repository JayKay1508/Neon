package com.exception;
import java.util.*;

public class Bank {
public void withDraw(int num1) throws Exception{
	int total=1000;
	if((total-num1)<500)
	{
		throw new Exception();
	}
	else
	{
		total=total-num1;
		System.out.println("Transaction Successful");
	}
}
public static void main(String[] args)
{
	Bank obj = new Bank();
	int num1;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Withdrawal Amount:");
	num1=scan.nextInt();
	
	try
	{
		obj.withDraw(num1);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
