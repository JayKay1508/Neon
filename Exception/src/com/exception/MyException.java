package com.exception;

public class MyException extends Exception{
public MyException()
{
 System.out.println("Balance is not sufficient:");
}
public String toString()
{
	return "Balance not sufficient";
}

}
