package com.dinesh.relations;

public class Pen{
	String Brand;
	String color;
	int size;
	double price;
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pen(String brand, String color, int size, double price) {
		super();
		Brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [Brand=" + Brand + ", color=" + color + ", size=" + size + ", price=" + price + "]";
	}
	

}
