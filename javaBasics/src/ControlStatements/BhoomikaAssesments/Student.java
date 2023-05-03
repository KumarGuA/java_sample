package ControlStatements.BhoomikaAssesments;

public class Student {
	String Name;
	int rollNo;
	int Mark1;
	int Mark2;
	int Mark3;
	int TotalMarks;

	public void calculateTotal(int english,int maths,int cs) {
		Mark1 = english;
		Mark2 = maths;
		Mark3 = cs;
	    TotalMarks = (Mark1 + Mark2 + Mark3);
	}

	public void displayStudDetails(String name, int RollNo) {

		Name = name;
		rollNo = RollNo;
		System.out.println("Student name :" + name);
		System.out.println("Student ID : " + RollNo);
		System.out.println("Total is " + TotalMarks);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.calculateTotal(98, 99, 100);
		obj.displayStudDetails("Bhoomika", 12);
		
	}

}
