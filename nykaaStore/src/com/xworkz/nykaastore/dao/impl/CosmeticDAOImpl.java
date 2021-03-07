package com.xworkz.nykaastore.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.xworkz.nykaastore.dao.CosmeticDAO;
import com.xworkz.nykaastore.dto.CosmeticsDTO;

public class CosmeticDAOImpl implements CosmeticDAO {

	ArrayList<CosmeticsDTO> cosmeticList = new ArrayList<CosmeticsDTO>();

	@Override
	public Connection getDBConnection() throws SQLException, ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/nykaa";
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
	public boolean save(CosmeticsDTO cosmetics) {

		String url = "jdbc:mysql://localhost:3306/nykaa";
		String username = "root";
		String password = "root123";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);

			Statement stmt = connection.createStatement();

			cosmeticList.add(cosmetics);
			cosmeticList.add(cosmetics);
			cosmeticList.add(cosmetics);
			int id = cosmetics.getCosmeticId();
			String brand = cosmetics.getBrand();
			String type = cosmetics.getType();
			int price = cosmetics.getPrice();
			int quantity = cosmetics.getQuantity();

			// String sqlQuery="INSERT INTO cosmetics " + "VALUES (16,
			// 'sugar','eyeliner',500,1)";
			// String sqlQuery="INSERT INTO cosmetics VALUES (17, 'pac','bronzer',1500,1)";

			String sqlQuery = "insert into cosmetics values ('" + id + "', '" + brand + "','" + type + "','" + price
					+ "','" + quantity + "')";

			// String sqlQuery="INSERT INTO cosmetics VALUES ("+cosmetics.getCosmeticId()+",
			// "+cosmetics.getBrand()+","+cosmetics.getType()+","+cosmetics.getPrice()+","+cosmetics.getQuantity()+")";

			int result = stmt.executeUpdate(sqlQuery);

			if (result >= 1) {
				return true;
			} else {
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
	public ArrayList<CosmeticsDTO> readAllRecords() {

		ArrayList<CosmeticsDTO> coslist = new ArrayList<CosmeticsDTO>();

		try {

			Connection conn = getDBConnection();

			Statement stmt = conn.createStatement();

			String sqlQuery = "select * from cosmetics;";

			ResultSet result = stmt.executeQuery(sqlQuery);

			while (result.next()) {

				CosmeticsDTO cosmeticsDTO = new CosmeticsDTO();

				int cosmeticId = result.getInt(1);
				cosmeticsDTO.setCosmeticId(cosmeticId);

				String brand = result.getString("brand");
				cosmeticsDTO.setBrand(brand);

				String type = result.getString(3);
				cosmeticsDTO.setType(type);

				int price = result.getInt(4);
				cosmeticsDTO.setPrice(price);

				int quantity = result.getInt("quantity");
				cosmeticsDTO.setQuantity(quantity);

				coslist.add(cosmeticsDTO);
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return coslist;
	}

	@Override
	public boolean update(CosmeticsDTO cosmetics) {

		try {
			Connection conn = getDBConnection();

			Statement stmt = conn.createStatement();

			String sqlQuery = "update cosmetics set brand='plum' where cosmeticId=25;";

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
	public boolean delete(CosmeticsDTO cosmetics) {// int cosmeticId

		try {
			Connection conn = getDBConnection();

			Statement stmt = conn.createStatement();

			String sqlQuery = "delete from cosmetics where cosmeticId=26 ;";

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
	public ArrayList<CosmeticsDTO> readNameAndBrand() {
		
		ArrayList<CosmeticsDTO> coslist = new ArrayList<CosmeticsDTO>();

		try {

			Connection conn = getDBConnection();

			Statement stmt = conn.createStatement();

			String sqlQuery = "select brand,type from cosmetics ;";

			ResultSet result = stmt.executeQuery(sqlQuery);

			while (result.next()) {

				CosmeticsDTO cosmeticsDTO = new CosmeticsDTO();

				String brand = result.getString("brand");
				cosmeticsDTO.setBrand(brand);

				String type = result.getString("type");
				cosmeticsDTO.setType(type);

				
				coslist.add(cosmeticsDTO);

			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return coslist;
	}

	@Override
	public int totalRecords() {
		
		
		try {
			Connection conn = getDBConnection();
			
			Statement stmt = conn.createStatement();

			String sqlQuery = "select COUNT(*) from cosmetics;";

			ResultSet result = stmt.executeQuery(sqlQuery);
			
			int i=0;
			while(result.next()) {
				i++;
			}
			return i;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		return 0;
	}

	

}
