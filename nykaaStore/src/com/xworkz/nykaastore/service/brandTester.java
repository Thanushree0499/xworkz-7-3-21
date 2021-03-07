package com.xworkz.nykaastore.service;

import java.util.ArrayList;

import com.xworkz.nykaastore.dao.CosmeticDAO;
import com.xworkz.nykaastore.dao.impl.CosmeticDAOImpl;
import com.xworkz.nykaastore.dto.CosmeticsDTO;

public class brandTester {

	public static void main(String[] args) {
		
CosmeticDAO cosmeticDAO=new CosmeticDAOImpl();
		
		ArrayList<CosmeticsDTO> cosmeticsDTOs=cosmeticDAO.readNameAndBrand();
		for (CosmeticsDTO cosmeticsDTO : cosmeticsDTOs) {
			
			System.out.println("cosmetic brand is: "+cosmeticsDTO.getBrand());
			System.out.println("cosmetic type is: "+cosmeticsDTO.getType());
			System.out.println("=========================================");
		}
		

	}

}
