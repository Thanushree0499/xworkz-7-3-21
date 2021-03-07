package com.xworkz.parks.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.xworkz.parks.dao.ParksDAO;
import com.xworkz.parks.dto.ParksDTO;

public class ParksDAOImpl implements ParksDAO {
	
	@Override
	public Connection getDBConnection() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/amusementparks";
		String username = "root";
		String password = "root123";
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
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
	public boolean save(ParksDTO parks) {
		String url="jdbc:mysql://localhost:3306/amusementparks";
		String username="root";
		String password="root123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url, username, password);
			System.out.println(connection);
			
			Statement stmt= connection.createStatement();
			int id=parks.getParkId();
			String name=parks.getName();
			String location=parks.getLocation();
			int pricePerHead=parks.getPricePerHead();
			String offersAvailable=parks.getOffersAvailable();
 	
		    String sqlQuery="insert into parks values ('"+id+"', '"+name+"','"+location+"','"+pricePerHead+"','"+offersAvailable+"')";
		
				
		    int result=stmt.executeUpdate(sqlQuery);
		    if(result>=1) {
			return true;
		}
		else {
			return false;
		}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return false;
	}

	
	@Override
	public ArrayList<ParksDTO> readAllRecords() {
		ArrayList<ParksDTO> parklist = new ArrayList<ParksDTO>();

		try {

			Connection conn = getDBConnection();

			Statement stmt = conn.createStatement();

			String sqlQuery = "select * from parks;";

			ResultSet result = stmt.executeQuery(sqlQuery);

			while (result.next()) {

				ParksDTO parksDTO = new ParksDTO();
				
				int parkId = result.getInt(1);
				parksDTO.setParkId(parkId);
				
				String name = result.getString(2);
				parksDTO.setName(name);

				String location = result.getString(3);
				parksDTO.setLocation(location);

				int pricePerHead = result.getInt(4);
				parksDTO.setPricePerHead(pricePerHead);

				String offersAvailable = result.getString(5);
				parksDTO.setOffersAvailable(offersAvailable);

				parklist.add(parksDTO);
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return parklist;
	}

	@Override
	public boolean update(ParksDTO parks) {
		try {
			Connection conn = getDBConnection();

			Statement stmt = conn.createStatement();

			String sqlQuery = "update parks set location='mysore' where parkId=6;";

			int result = stmt.executeUpdate(sqlQuery);

			if (result >= 1) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}


	@Override
	public boolean delete(ParksDTO parks) {
		try {
			Connection conn = getDBConnection();

			Statement stmt = conn.createStatement();

			String sqlQuery = "delete from parks where parkId=5;";

			int result = stmt.executeUpdate(sqlQuery);

			if (result >= 1) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	//@Override
	/*public ArrayList<ParksDTO> readNameAndLocation() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
