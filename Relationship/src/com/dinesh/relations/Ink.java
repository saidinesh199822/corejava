package com.dinesh.relations;

public class Ink {
	String company;
	String date;
	String quantity;
	Pen pen;
	
	public void readPenProperties()
	{
		System.out.println("pen Brand:"+pen.Brand);
		System.out.println("Pen color:" +pen.color);
		System.out.println("pen size:"+pen.price);
		System.out.println("Pen price:"+pen.size);
	}
	public void inkProperties()
	{
		System.out.println(company);
		System.out.println(date);
		System.out.println(quantity);
	}
	
	public Ink() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ink(String company, String date, String quantity, Pen pen) {
		super();
		this.company = company;
		this.date = date;
		this.quantity = quantity;
		this.pen = pen;
	}
	@Override
	public String toString() {
		return "Ink [company=" + company + ", date=" + date + ", quantity=" + quantity + ", pen=" + pen + "]";
	}
	

}
