package com.dinesh.relations;

public class AggriTester {
public static void main(String[] args) {
	Library library = new Library("Sai","madigubba","243","Dinesh");
	Books book = new Books("The Angela", "Rabindranath", "Blue", library);
	book.library =library;
	System.out.println(book);
	
	
}
}
