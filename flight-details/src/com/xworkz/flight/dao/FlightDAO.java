package com.xworkz.flight.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import com.xworkz.flight.dto.FlightDTO;

public interface FlightDAO {
	
	Connection getDbConnection() throws SQLException;
	
	public boolean insertRecord(FlightDTO flightDTO);
	
	void insertListOfRecords(ArrayList<FlightDTO> flightDTOs);
	
	void insertMultipleRecords(ArrayList<FlightDTO> flightDTOs);
	
	boolean updateRecordByFlightId(String flightName,String destination);
	
	boolean deleteByFlightId(int FlightId);
}
