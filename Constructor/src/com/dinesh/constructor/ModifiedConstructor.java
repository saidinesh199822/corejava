package com.dinesh.constructor;

public class ModifiedConstructor {
	String brand;
	String Display;
	float price;
	boolean isthisiphone = true;
	
	public ModifiedConstructor(String brand, String display, float price, boolean isthisiphone) {
		super();
		this.brand = brand;
		Display = display;
		this.price = price;
		this.isthisiphone = isthisiphone;
	}

	@Override
	public String toString() {
		return "ModifiedConstructor [brand=" + brand + ", Display=" + Display + ", price=" + price + ", isthisiphone="
				+ isthisiphone + "]";
	}
	
	

}
