package BhoomikaAssesments;

class StudentDetails {
	String Name;
	int rollNo;
}

class Marks {
	int English = 99;
	int Maths = 95;
	int CS = 100;
	int TotalMarks = (English + Maths + CS);

}

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetails obj1 = new StudentDetails();
		obj1.Name = "Bhoomika";
		obj1.rollNo = 123;
		System.out.println("Student Name is : " + obj1.Name);
		System.out.println("Student Roll No is :" + obj1.rollNo);

		Marks obj2 = new Marks();
		// obj2.TotalMarks(99+90+100);
		System.out.println("Total Marks is :" + obj2.TotalMarks);

		// int per = (obj2.TotalMarks/300*100);
		System.out.println("Percentage:" + obj2.TotalMarks * 100 / 300);

	}
}
