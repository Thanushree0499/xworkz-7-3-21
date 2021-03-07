package com.xworkz.flight.dto;

public class FlightDTO {
	
	private int flightId;
	private String name;
	private int fuelCapacity;
	private double arrTime;
	private String source;
	private String destination;
	
	public FlightDTO() {
		
	}
	
	
	public FlightDTO(int flightId, String name, int fuelCapacity, double arrTime, String source, String destination) {
		super();
		this.flightId = flightId;
		this.name = name;
		this.fuelCapacity = fuelCapacity;
		this.arrTime = arrTime;
		this.source = source;
		this.destination = destination;
	}


	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public double getArrTime() {
		return arrTime;
	}

	public void setArrTime(double arrTime) {
		this.arrTime = arrTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "FlightDTO [flightId=" + flightId + ", name=" + name + ", fuelCapacity=" + fuelCapacity + ", arrTime="
				+ arrTime + ", source=" + source + ", destination=" + destination + "]";
	}
	
	
}
