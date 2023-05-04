package ControlStatements.SavitaAssessments;

public class BookDetails {
	String Name = "Physics";
	int ID;
	int Pages;
	int Price = 1000;

	public void Bookinformation(String name, int id) {

		Name = name;
		ID = id;

		System.out.println("Bookinformation");
	}

	public static void main(String[] args) {

		BookDetails book = new BookDetails();
		book.Pages = 500;

		System.out.println("Pages in the Book : " + book.Pages);

		BookDetails book2 = new BookDetails();
		book2.Price = 1500;
		System.out.println("Price of the Book is :" + book2.Price);

		BookDetails book3 = new BookDetails();
		book3.Name = "Chemistry";
		book3.ID = 123456;
		System.out.println("Book ID is :" + book3.Name);
		System.out.println("Book name is :" + book3.ID);

	}

}
