package com.xworkz.parks.dto;

public class ParkTicketDTO {
	
	private int ticketId;
	private int ticketPrice;
	private int numberOfPersons;
	private String type;
	
	public ParkTicketDTO() {

	}

	public ParkTicketDTO(int ticketId, int ticketPrice, int numberOfPersons, String type) {
		super();
		this.ticketId = ticketId;
		this.ticketPrice = ticketPrice;
		this.numberOfPersons = numberOfPersons;
		this.type = type;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumberOfPersons() {
		return numberOfPersons;
	}

	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ParkTicketDTO [ticketId=" + ticketId + ", ticketPrice=" + ticketPrice + ", numberOfPersons="
				+ numberOfPersons + ", type=" + type + "]";
	}
	

}
