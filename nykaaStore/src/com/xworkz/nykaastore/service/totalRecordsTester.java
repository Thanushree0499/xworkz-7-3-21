package com.xworkz.nykaastore.service;

import com.xworkz.nykaastore.dao.CosmeticDAO;
import com.xworkz.nykaastore.dao.impl.CosmeticDAOImpl;
import com.xworkz.nykaastore.dto.CosmeticsDTO;

public class totalRecordsTester {

	public static void main(String[] args) {
	CosmeticsDTO dto=new CosmeticsDTO();
	
	CosmeticDAO dao=new CosmeticDAOImpl();
	
	int res=dao.totalRecords();
	System.out.println("total records "+res);

	}

}
