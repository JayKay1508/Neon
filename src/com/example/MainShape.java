package com.example;

public class MainShape
{
	public static void main (String [] args)
	{
		Shape obj=new triangle();
		System.out.println("The Area of Triangle:"+obj.area());
		obj=new rectangle();
		System.out.println("The Area of Rectangle:"+obj.area());
		if(obj instanceof rectangle)
		{
			System.out.println("obj is refering Rectangle Instance");
		}
	}
}

