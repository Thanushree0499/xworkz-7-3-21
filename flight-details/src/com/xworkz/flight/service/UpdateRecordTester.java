package com.xworkz.flight.service;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class UpdateRecordTester {

	public static void main(String[] args) {
		
		FlightDTO flightDTO=new FlightDTO();
		
		FlightDAO flightDAO=new FlightDAOImpl();
		
		boolean res=flightDAO.updateRecordByFlightId("Quater", "manali");
		
		if(res) {
			System.out.println("record updation successfull "+res);
		}else {
			System.out.println("record updation not done");
		}

	}

}
