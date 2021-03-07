package com.xworkz.decor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ThanuTester {
	public static void main(String[] args) {
		
	try {
		Class.forName("com.mysql.jdbc.Driver");
		
		int id=5;
		String name="shruthi";
		int forWhat=4;
		double dimension=1000;
		int budget=700000;
		
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz", "root", "root123");
		
		//String  query="insert into interior values(1,\"thanushre\",2,2000.00,400000);";
		//String  query="insert into interior values(1,'thanushre',2,2000.00,400000);";
		
		StringBuffer sql=new StringBuffer("insert into interior values ");
		sql.append("(");
		sql.append(id);
		sql.append(",");
		sql.append("'");
		sql.append(name);
		sql.append("'");
		sql.append(",");
		sql.append(forWhat);
		sql.append(",");
		sql.append(dimension);
		sql.append(",");
		sql.append(budget);
		sql.append(")");
		
		System.out.println(sql.toString());
		
		Statement statement=connection.createStatement();
		
		boolean result=statement.execute(sql.toString());
		System.out.println(result);
		connection.close();
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace();
	}
	}
}
