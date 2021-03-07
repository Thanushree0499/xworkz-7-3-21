package com.xworkz.nykaastore.service;

import com.xworkz.nykaastore.dao.CosmeticDAO;
import com.xworkz.nykaastore.dao.impl.CosmeticDAOImpl;
import com.xworkz.nykaastore.dto.CosmeticsDTO;

public class updateTester {

	public static void main(String[] args) {
		
		CosmeticsDTO cosmeticsDTO=new CosmeticsDTO();
        CosmeticDAO dao=new CosmeticDAOImpl();
		
		
		boolean res1=dao.update(cosmeticsDTO);
		if(res1) {
			System.out.println("record updation successfull    "+res1);
		}
		else {
			System.out.println("problem in updating the record");
		}

	}

}
