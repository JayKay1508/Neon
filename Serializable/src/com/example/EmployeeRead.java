package com.example;
import java.io.*;
public class EmployeeRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("d:\\Employee.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Arised:"+e);
		}
		
	}

}
