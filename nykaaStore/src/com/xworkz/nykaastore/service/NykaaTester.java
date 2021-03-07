package com.xworkz.nykaastore.service;

import java.util.ArrayList;

import com.xworkz.nykaastore.dao.CosmeticDAO;
import com.xworkz.nykaastore.dao.impl.CosmeticDAOImpl;
import com.xworkz.nykaastore.dto.CosmeticsDTO;

public class NykaaTester {

	public static void main(String[] args) {
		
		CosmeticsDTO dto1=new CosmeticsDTO(27,"LaGirl","concealer",500,1);
		/*dto1.setCosmeticId(19);
		dto1.setBrand("colorbar");
		dto1.setType("contour");
		dto1.setPrice(800);
		dto1.setQuantity2();*/
		CosmeticsDTO dto2=new CosmeticsDTO(28,"lotus","kajal",300,2);
		CosmeticsDTO dto3=new CosmeticsDTO(29,"nykaa","highlighter",400,1);

		CosmeticDAO dao=new CosmeticDAOImpl();
		
		
		boolean res1=dao.save(dto1);
		if(res1) {
			System.out.println("record insertion successfull"+res1);
		}
		else {
			System.out.println("problem inserting in record");
		}
		boolean res2=dao.save(dto2);
		if(res2) {
			System.out.println("record insertion successfull"+res2);
		}
		else {
			System.out.println("problem inserting in record");
		}
		boolean res3=dao.save(dto3);
		if(res3) {
			System.out.println("record insertion successfull"+res3);
		}
		else {
			System.out.println("problem inserting in record");
		}
		

	}

}
