package BhoomikaAssesments;

public class Student {
	String Name;
	int rollNo;
	int Mark1;
	int Mark2;
	int Mark3;
	int TotalMarks;

	public void calculateTotal() {
		TotalMarks = (Mark1 + Mark2 + Mark3);
	}

	public void displayStudDetails(String name, int RollNo, int mar1, int mar2, int mar3) {

		Name = name;
		rollNo = RollNo;
		Mark1 = mar1;
		Mark2 = mar2;
		Mark3 = mar3;
		System.out.println("Student name :" + name);
		System.out.println("Student ID : " + RollNo);
		System.out.println("Total Marks " + (Mark1 + Mark2 + Mark3));
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.displayStudDetails("Bhoomika", 12, 99, 89, 89);
		obj.calculateTotal();

	}

}
