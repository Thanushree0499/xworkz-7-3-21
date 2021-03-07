package com.xworkz.parks.service;

import java.util.ArrayList;

import com.xworkz.parks.dao.ParksDAO;
import com.xworkz.parks.dao.impl.ParksDAOImpl;
import com.xworkz.parks.dto.ParksDTO;



public class readParkTester {

	public static void main(String[] args) {
        
        ParksDAO parksDAO=new ParksDAOImpl();
		
		ArrayList<ParksDTO> parksDTOs=parksDAO.readAllRecords();
		
		for (ParksDTO parksDTO : parksDTOs) {
			System.out.println("park Id is "+parksDTO.getParkId());
			System.out.println("park name is "+parksDTO.getName());
			System.out.println("park location is "+parksDTO.getLocation());
			System.out.println("park price is "+parksDTO.getParkId());
			System.out.println("park offers are "+parksDTO.getOffersAvailable());
			System.out.println("---------------------------------------");
			
		}
		

	}

}
