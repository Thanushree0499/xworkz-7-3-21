package com.xworkz.tester;

import com.xworkz.dao.MobileDAO;
import com.xworkz.dao.MobileDAOImpl;
import com.xworkz.dto.MobileDTO;

public class insertTester {

	public static void main(String[] args) {
		
		MobileDTO mobileDTO=new MobileDTO(25, "samsung", 20000, 2);
		
		MobileDAO dao=new MobileDAOImpl();
		
		boolean res=dao.inserRecord(mobileDTO);
		
		if(res) {
			System.out.println("record inserted successfuly");
		}else {
			System.out.println("record not inserted");
		}

}
}
