package com.xworkz.nykaastore.dto;

public class CosmeticsDTO {

	private int CosmeticId;
	private String brand;
	private String type;
	private int price;
	private int quantity;
	
	public CosmeticsDTO() {
		
	}

	public CosmeticsDTO(int cosmeticId, String brand, String type, int price, int quantity) {
		super();
		CosmeticId = cosmeticId;
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public int getCosmeticId() {
		return CosmeticId;
	}

	public void setCosmeticId(int cosmeticId) {
		CosmeticId = cosmeticId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticsDTO [CosmeticId=" + CosmeticId + ", brand=" + brand + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
}
