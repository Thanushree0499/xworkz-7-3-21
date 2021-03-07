package com.xworkz.tester;

import com.xworkz.dao.MobileDAO;
import com.xworkz.dao.MobileDAOImpl;
import com.xworkz.dto.MobileDTO;

public class updateTester {

	public static void main(String[] args) {
		
		MobileDTO mobileDTO=new MobileDTO();
		MobileDAO mobileDAO=new MobileDAOImpl();
		boolean res=mobileDAO.updateRecord(mobileDTO);
		if(res) {
			System.out.println("record updated successfully");
		}else {
			System.out.println("record not updated");
		}
		
	
}
}