package com.dinesh.relations;

public class Books {
String BookName;
String BookAuthor;
String BookColor;
Library library;
public void libraryProperties()
{
	System.out.println("Library Name :"+library.libraryName);
	System.out.println("Owner :"+library.LibraryOwner);
	System.out.println("Library Location :"+library.location);
	System.out.println("Number of books :"+library.NumberOfBooks);
}

public void bookProperties()
{
	System.out.println(BookName);
	System.out.println(BookAuthor);
	System.out.println(BookColor);
}

public Books() {
	super();
	// TODO Auto-generated constructor stub
}

public Books(String bookName, String bookAuthor, String bookColor, Library library) {
	super();
	BookName = bookName;
	BookAuthor = bookAuthor;
	BookColor = bookColor;
	this.library = library;
}

@Override
public String toString() {
	return "Books [BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", BookColor=" + BookColor + ", library="
			+ library + "]";
}

}
