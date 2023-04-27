package ControlStatements.SavitaAssessments;

class Student {

	String Name;

	int rollNo;

	String Branch;

	String Division;

}

class marks {

	int Cad = 80;

	int Maths = 90;

	int CS = 100;

	int Physics = 85;

	int TotalMarks = (Cad + Maths + CS + Physics);

}

class StudentDetails {

	public static void main(String[] args) {

		Student details = new Student();

		details.Name = "Sahasra";

		details.rollNo = 55;

		details.Branch = "CS";

		details.Division = "A";

		System.out.println("Student Name is : " + details.Name);

		System.out.println("Student Roll No is :" + details.rollNo);

		System.out.println("Student Branch No is :" + details.Branch);

		System.out.println("Student Division No is :" + details.Division);

		marks m = new marks();

		System.out.println("Total Marks is :" + m.TotalMarks);

		System.out.println("Percentage:" + m.TotalMarks * 100 / 400);

	}

}