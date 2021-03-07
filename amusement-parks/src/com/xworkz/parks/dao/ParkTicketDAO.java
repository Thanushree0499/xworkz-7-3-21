package com.xworkz.parks.dao;

import com.xworkz.parks.dto.ParkTicketDTO;
import com.xworkz.parks.dto.ParksDTO;

public interface ParkTicketDAO {

	public void parkTransaction(ParksDTO parksDTO, ParkTicketDTO parkTicketDTO);
}
