package com.xworkz.parks.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.parks.dao.ParkTicketDAO;
import com.xworkz.parks.dto.ParkTicketDTO;
import com.xworkz.parks.dto.ParksDTO;

public class ParkTicketDAOImpl implements ParkTicketDAO {

	@Override
	public void parkTransaction(ParksDTO parksDTO, ParkTicketDTO parkTicketDTO) {
		
		ParksDAOImpl parksDAOImpl=new ParksDAOImpl();
		Connection connection=null;
		
		try {
			connection=parksDAOImpl.getDBConnection();
			
			connection.setAutoCommit(false);
			
			String sqlQuery="insert into parks values(?,?,?,?,?);";
			
			PreparedStatement preparedStatement=connection.prepareStatement(sqlQuery);
			
			preparedStatement.setInt(1, parksDTO.getParkId());
			preparedStatement.setString(2, parksDTO.getName());
			preparedStatement.setString(3, parksDTO.getLocation());
			preparedStatement.setInt(4, parksDTO.getPricePerHead());
			preparedStatement.setString(5, parksDTO.getOffersAvailable());
			
			int res=preparedStatement.executeUpdate();
			System.out.println(res);
			
			String sqlQuery1="insert into ticket values(?,?,?,?);";
			
			PreparedStatement preparedStatement2=connection.prepareStatement(sqlQuery1);
			
			preparedStatement2.setInt(1, parkTicketDTO.getTicketId());
			preparedStatement2.setInt(2, parkTicketDTO.getTicketPrice());
			preparedStatement2.setInt(3, parkTicketDTO.getNumberOfPersons());
			preparedStatement2.setString(4,parkTicketDTO.getType());
			
			int res1=preparedStatement2.executeUpdate();
			System.out.println(res1);
			
			connection.commit();
		} catch (ClassNotFoundException e) {
			try {
				System.out.println("rolling back because something went wrong");
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				System.out.println("rolling back because something went wrong");
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
