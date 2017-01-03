package com.studentdetails;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class ShowColumnName {
	public static void main(String[] args)
	{
		try
		{
		Class.forName("org.h2.Driver");
		Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","admin","niit2016");
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from Student");
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int cc=rsmd.getColumnCount();
		
		for(int i=1;i<=cc;i++)
		{
			System.out.println(rsmd.getColumnName(i)+"		");
		}
		
		System.out.println();
		
		while(rs.next());
		{
			System.out.println(rs.getInt(1)+"	");
			System.out.println(rs.getInt(2)+"		");
			System.out.println(rs.getInt(3)+"			");
		}
		stmt.close();
		conn.close();
	}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
	}
}
