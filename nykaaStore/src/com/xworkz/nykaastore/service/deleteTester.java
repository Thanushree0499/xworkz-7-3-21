package com.xworkz.nykaastore.service;

import com.xworkz.nykaastore.dao.CosmeticDAO;
import com.xworkz.nykaastore.dao.impl.CosmeticDAOImpl;
import com.xworkz.nykaastore.dto.CosmeticsDTO;

public class deleteTester {

	public static void main(String[] args) {
		CosmeticsDTO cosmeticsDTO=new CosmeticsDTO();
        CosmeticDAO dao=new CosmeticDAOImpl();
		
		
		boolean res1=dao.delete(cosmeticsDTO);
		if(res1) {
			System.out.println("record deletion successfull    "+res1);
		}
		else {
			System.out.println("problem in deleting the record");
		}

	}

	

}
