package com.xworkz.flight.service;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class deleteRecordTester {

	public static void main(String[] args) {
		
      FlightDTO flightDTO=new FlightDTO();
		
		FlightDAO flightDAO=new FlightDAOImpl();
		
		boolean res=flightDAO.deleteByFlightId(2);
		
		if(res) {
			System.out.println("record deletion successfull "+res);
		}else {
			System.out.println("record deletion not done");
		}

		
	}

}
