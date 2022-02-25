package com.dinesh.constructor;

public class ParameterTester {
	public static void main(String[] args) {
		ParameterConstructor obj = new ParameterConstructor(29000, "green", "amoled", 15.6);
		System.out.println(obj.price);
		System.out.println(obj.display);
		System.out.println(obj.color);
		System.out.println(obj.size);
		
		
	}

}
