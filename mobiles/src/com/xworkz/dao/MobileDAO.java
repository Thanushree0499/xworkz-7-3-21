package com.xworkz.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.xworkz.dto.MobileDTO;

public interface MobileDAO {
	
	public Connection getDbConnection()  throws SQLException;
	
	public boolean inserRecord(MobileDTO mobileDTO);
	
	public boolean updateRecord(MobileDTO mobileDTO);
}
