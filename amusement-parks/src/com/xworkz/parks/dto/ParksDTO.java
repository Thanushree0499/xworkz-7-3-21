package com.xworkz.parks.dto;

public class ParksDTO {
    
	private int parkId;
	private String name;
	private String location;
	private int pricePerHead;
	private String offersAvailable;
	
	public ParksDTO() {
		
	}

	public ParksDTO(int parkId, String name, String location, int pricePerHead, String offersAvailable) {
		super();
		this.parkId = parkId;
		this.name = name;
		this.location = location;
		this.pricePerHead = pricePerHead;
		this.offersAvailable = offersAvailable;
	}

	public int getParkId() {
		return parkId;
	}

	public void setParkId(int parkId) {
		this.parkId = parkId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPricePerHead() {
		return pricePerHead;
	}

	public void setPricePerHead(int pricePerHead) {
		this.pricePerHead = pricePerHead;
	}

	public String getOffersAvailable() {
		return offersAvailable;
	}

	public void setOffersAvailable(String offersAvailable) {
		this.offersAvailable = offersAvailable;
	}

	@Override
	public String toString() {
		return "ParksDTO [parkId=" + parkId + ", name=" + name + ", location=" + location + ", pricePerHead="
				+ pricePerHead + ", offersAvailable=" + offersAvailable + "]";
	}
	
	
}
