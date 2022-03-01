package com.dinesh.relations;

public class Library {
	String libraryName;
	String location;
	String NumberOfBooks;
	String LibraryOwner;
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(String libraryName, String location, String numberOfBooks, String libraryOwner) {
		super();
		this.libraryName = libraryName;
		this.location = location;
		NumberOfBooks = numberOfBooks;
		LibraryOwner = libraryOwner;
	}
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", location=" + location + ", NumberOfBooks=" + NumberOfBooks
				+ ", LibraryOwner=" + LibraryOwner + "]";
	}
	
	

}
