package com.dinesh.relations;

public class AggrigationTester {
	public static void main(String[] args) {
		
		Pen pen = new Pen("cello", "orange",10, 25.00);
		Ink ink = new Ink("Doms","22-05-1998","23ml",pen);
		ink.pen = pen;
		
		System.out.println(ink);
		
			
	}

}
