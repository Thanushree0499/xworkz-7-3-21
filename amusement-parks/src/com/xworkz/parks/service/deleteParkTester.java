package com.xworkz.parks.service;

import com.xworkz.parks.dao.ParksDAO;
import com.xworkz.parks.dao.impl.ParksDAOImpl;
import com.xworkz.parks.dto.ParksDTO;

public class deleteParkTester {

	public static void main(String[] args) {
		ParksDTO parksDTO=new ParksDTO();
        ParksDAO dao=new ParksDAOImpl();
		
		
		boolean res1=dao.delete(parksDTO);
		if(res1) {
			System.out.println("record deletion successfull    "+res1);
		}
		else {
			System.out.println("problem in deleting the record");
		}

	}

	

}
