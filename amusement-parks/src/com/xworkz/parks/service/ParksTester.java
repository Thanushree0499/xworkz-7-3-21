package com.xworkz.parks.service;


import com.xworkz.parks.dao.ParksDAO;
import com.xworkz.parks.dao.impl.ParksDAOImpl;
import com.xworkz.parks.dto.ParksDTO;

public class ParksTester {

	public static void main(String[] args) {
		
		ParksDTO dto1=new ParksDTO(6,"mysoreSnowCity","banglore",1000,"no");
		
		
		ParksDAO dao=new ParksDAOImpl();
		
		boolean res1=dao.save(dto1);
		if(res1) {
			System.out.println("record insertion successfull"+res1);
		}
		else {
			System.out.println("problem inserting in record");
		}
		

	}

}

