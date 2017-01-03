package com.example;

class triangle extends Shape  //Specific class
{
	public triangle()//constructor
	{
		dim1=10;
		dim2=20;
	}
	//Overriding the area() method of the Shape class
	public double area()
	{
		return 0.5*dim1*dim2;
	}
}
