package ControlStatements.PujithaAssessments;

public class Student {

	int rollNum, mark1, mark2, mark3, totalMarks;
	String studName;
	
	public int calculateTotal(int m1, int m2, int m3)
	{
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		totalMarks = m1+m2+m3;
		return totalMarks;
	}
	
	public void displayStudDetails(int id, String sName) {
		rollNum = id;
		studName = sName;
		System.out.println("Roll Number: "+rollNum +"\n" +"Student Name: "+studName+"\n"+ "Total Marks: "+totalMarks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.calculateTotal(10,10,10);
		s.displayStudDetails(1, "Pujitha");
	}

}
