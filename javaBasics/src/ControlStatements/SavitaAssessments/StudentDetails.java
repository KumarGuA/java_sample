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

	public void calculateTotal() {
		TotalMarks = (Eng + Maths + Chemistry);
	}

	public void displayStudDetails(String name, int rolNo, int eng, int maths, int chemistry) {

		Name = name;
		rollNo = rolNo;
		Eng = eng;
		Maths = maths;
		Chemistry = chemistry;
		System.out.println("Student name :" + name);
		System.out.println("Student rolno : " + rolNo);
        System.out.println("Total is " + (Eng + Maths + Chemistry));
        System.out.println("Percentage is " + (Eng + Maths + Chemistry)*100/300);   
	}

	public static void main(String[] args) {

		StudentDetails stud = new StudentDetails();
		stud.displayStudDetails("Sahasra", 35, 55, 89, 96);
		stud.calculateTotal();
		
		StudentDetails stud1 = new StudentDetails();
		stud1.Branch = "CS";
		stud1.Division = "B";
		System.out.println("Student branch is  :" + stud1.Branch);
		System.out.println("Student division is  : " + stud1.Division);
	}

}
