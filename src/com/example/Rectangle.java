package com.example;

class rectangle extends Shape //specific class
{
	public rectangle()//constructor
	{
		dim1=10;
		dim2=20;
	}
	//overriding the area() method of the Shape class;
	public double area()
	{
		return dim1*dim2;
	}
}