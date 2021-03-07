package com.xworkz.nykaastore.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


import com.xworkz.nykaastore.dto.CosmeticsDTO;

public interface CosmeticDAO {
	
	boolean save(CosmeticsDTO cosmetics);
	
	public Connection getDBConnection() throws SQLException, ClassNotFoundException;
	
	public ArrayList<CosmeticsDTO> readAllRecords();
	
	boolean update(CosmeticsDTO cosmetics);
	
	boolean delete(CosmeticsDTO cosmetics);
	
	public ArrayList<CosmeticsDTO> readNameAndBrand();
	
	public int totalRecords();
	
	

}
