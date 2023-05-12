package ControlStatements.SavitaAssessments;

public class StudentDetails {
	String Name;
	int rollNo;
	int Eng;
	int Maths;
	int Chemistry;
	String Branch;
	String Division;
	int TotalMarks;

	public void calculateTotal(int english, int maths, int cs) {
		Eng = english;
		Maths = maths;
		Chemistry = cs;
		TotalMarks = (Maths + Maths + Chemistry);
	}

	public void displayStudDetails(String name, int rolNo) {

		Name = name;
		rollNo = rolNo;
        System.out.println("Student name :" + name);
		System.out.println("Student rolno : " + rolNo);
		System.out.println("Total is : " + TotalMarks);
		System.out.println("Percentage is : " + TotalMarks * 100 / 300);
	}

	public static void main(String[] args) {

		StudentDetails stud1 = new StudentDetails();
		stud1.Branch = "CS";
		stud1.Division = "B";
		System.out.println("Student branch is  :" + stud1.Branch);
		System.out.println("Student division is  : " + stud1.Division);
		StudentDetails stud = new StudentDetails();
		stud.calculateTotal(55, 89, 96);
		stud.displayStudDetails("Sahasra", 24);
		

	}

}
