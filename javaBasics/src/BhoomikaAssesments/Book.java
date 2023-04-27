package BhoomikaAssesments;

public class Book {
	int BookID;
	int Pages;
	int Price = 550;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1 = new Book();
		obj1.BookID = 012;
		obj1.Pages = 200;

		System.out.println("Book ID is :" + obj1.BookID);
		System.out.println("Pages in the Book : " + obj1.Pages);
		System.out.println("Price of Book for Non-Membership :" + obj1.Price);

		Book obj2 = new Book();
		obj2.Price = 500;
		System.out.println("Price of the Book with Membership :" + obj2.Price);

	}

}
