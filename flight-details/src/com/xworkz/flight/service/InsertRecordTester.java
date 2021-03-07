package com.xworkz.flight.service;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class InsertRecordTester {

	public static void main(String[] args) {


		FlightDTO flightDTO=new FlightDTO(5, "GOair", 100, 12.00,"pune", "mumbai");		
		FlightDAO flightDAO=new FlightDAOImpl();
		
		boolean record=flightDAO.insertRecord(flightDTO);

		if(record) {
			System.out.println("insertion succesfull "+record);
		}
		else {
			System.out.println("insertion not done");
		}
	}

}
