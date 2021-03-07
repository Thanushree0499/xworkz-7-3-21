package com.xworkz.nykaastore.service;

import java.util.ArrayList;

import com.xworkz.nykaastore.dao.CosmeticDAO;
import com.xworkz.nykaastore.dao.impl.CosmeticDAOImpl;
import com.xworkz.nykaastore.dto.CosmeticsDTO;

public class readTester {

	public static void main(String[] args) {
		
		CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
		
		ArrayList<CosmeticsDTO> cosmeticsDTOs=cosmeticDAO.readAllRecords();
		
		for (CosmeticsDTO cosmeticsDTO : cosmeticsDTOs) {
			System.out.println("cosmetic id is: "+cosmeticsDTO.getCosmeticId());
			System.out.println("cosmetic brand is: "+cosmeticsDTO.getBrand());
			System.out.println("cosmetic type is: "+cosmeticsDTO.getType());
			System.out.println("cosmetic price is: "+cosmeticsDTO.getPrice());
			System.out.println("cosmetic quantity is: "+cosmeticsDTO.getQuantity());
			System.out.println("=========================================");
		}
		

	}

}
