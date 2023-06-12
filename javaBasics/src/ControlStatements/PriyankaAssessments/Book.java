package ControlStatements.PriyankaAssessments;

public class Book {
	int BookID;
	int Pages;
	int Price;

	public static void main(String[] args) {
		Book detail = new Book();
		detail.BookID = 8877;
		detail.Pages = 300;
		detail.Price = 500;
		System.out.println("The BookId is-" + detail.BookID);
		System.out.println("Number of pages in the book-" + detail.Pages);
		System.out.println("Price of the book-" + detail.Price);

	}

}
