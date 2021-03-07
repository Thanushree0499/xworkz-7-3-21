package com.xworkz.parks.service;

import com.xworkz.parks.dao.ParkTicketDAO;
import com.xworkz.parks.dao.impl.ParkTicketDAOImpl;
import com.xworkz.parks.dao.impl.ParksDAOImpl;
import com.xworkz.parks.dto.ParkTicketDTO;
import com.xworkz.parks.dto.ParksDTO;

public class ParkTicketTester {

	public static void main(String[] args) {
		
		ParksDTO parksDTO=new ParksDTO(21, "MysoreSnowCity", "Mysore",1000, "no");
		
		ParkTicketDTO parkTicketDTO=new ParkTicketDTO(13, 1000, 2,"adult");
		
		ParkTicketDAO parkTicketDAO=new ParkTicketDAOImpl();
		
		parkTicketDAO.parkTransaction(parksDTO, parkTicketDTO);
		
	}

}
