package com.xworkz.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.dto.MobileDTO;

public class MobileDAOImpl implements MobileDAO {

	@Override
	public Connection getDbConnection() throws SQLException {
	
		String url="jdbc:mysql://localhost:3306/mobiles";
		String user="root";
		String password="root123";
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    connection=DriverManager.getConnection(url, user, password);
			System.out.println(connection);
			return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new SQLException();
	}

	@Override
	public boolean inserRecord(MobileDTO mobileDTO) {
		
		try {
			Connection connection=getDbConnection();
			
			int id=mobileDTO.getMobileId();
			String name=mobileDTO.getName();
			int price=mobileDTO.getPrice();
			int quantity=mobileDTO.getQuantity();
			
			String query="insert into mobile values("+id+",'"+name+"',"+price+","+quantity+")";
			
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(query);
			if(result>=1) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateRecord(MobileDTO mobileDTO) {
		
		Connection connection=null;
		
		try {
			connection =getDbConnection();
			
			String query="update mobile set quantity=2 where mobileId=11";
			Statement statement=connection.createStatement();
			int result=statement.executeUpdate(query);
			if(result>=1) {
				return true;
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	

	

}
