package com.xworkz.parks.service;

import com.xworkz.parks.dao.ParksDAO;
import com.xworkz.parks.dao.impl.ParksDAOImpl;
import com.xworkz.parks.dto.ParksDTO;

public class updateParkTester {

	public static void main(String[] args) {
		
		ParksDTO parksDTO=new ParksDTO();
        
        ParksDAO dao=new ParksDAOImpl();
		
		
		boolean res1=dao.update(parksDTO);
		if(res1) {
			System.out.println("record updation successfull    "+res1);
		}
		else {
			System.out.println("problem in updating the record");
		}

	}

}