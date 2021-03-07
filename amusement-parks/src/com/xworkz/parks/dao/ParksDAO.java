package com.xworkz.parks.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import com.xworkz.parks.dto.ParksDTO;

public interface ParksDAO {
	
	boolean save(ParksDTO parks);
	
    public Connection getDBConnection() throws SQLException, ClassNotFoundException;
	
	public ArrayList<ParksDTO> readAllRecords();
	
	boolean update(ParksDTO parks);
	
	boolean delete(ParksDTO parks);
	
	//public ArrayList<ParksDTO> readNameAndLocation();

}
