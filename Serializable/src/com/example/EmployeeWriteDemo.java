package com.example;
import java.io.*;
public class EmployeeWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("d:\\Employee.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Employee obj=new Employee();
			obj.setEmpid("E001");
			obj.setEmpname("Vinod");
			obj.setSalary(5000);
			
			oos.writeObject(obj);
			
			System.out.println("Object Successfully Written");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
