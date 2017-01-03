package com.studentdetails;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.*;

public class InsertData {

	public static void main(String[] args) {
		try{
			Class.forName("org.h2.Driver");
			Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test2","admin","niit2016");		
		PreparedStatement psmt=conn.prepareStatement("insert into Student values (?,?,?)");
		
	
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter Student ID");
     int sid =scan.nextInt();

     System.out.println("Enter Student name");
     String sname =scan.next();
     
     System.out.println("Enter Student course");
     String course =scan.next();
     
     psmt.setInt(1, sid);
     psmt.setString(2, sname);
     psmt.setString(3, course);
     

		int row_eff=psmt.executeUpdate();
		
		System.out.println(row_eff+"  row effected");
		
		psmt.close();
		conn.close();
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
	}

}
}
