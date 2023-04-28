package ControlStatements.PriyankaAssessments;

public class Student {
	static String studName;
	static int rollNum;
	static int mark1;
	static int mark2;
	static int mark3;
	static int totalMarks;
	

	public static void main(String[] args) {
		Student.studName="Priyanka";
		Student.rollNum=8811;
		Student.mark1=50;
		Student.mark2=60;
		Student.mark3=70;
		
		calculateTotal();
		
		displayStudDetails();
	}
		
		public static void calculateTotal(){
			totalMarks=	mark1+mark2+mark3;
			}
		public static void displayStudDetails() {
			System.out.println("The name of the student is-"+studName);
			System.out.println("Roll number of the student is-"+rollNum);
			System.out.println("Marks in English is-"+mark1);
			System.out.println("Marks in Hindi is-"+mark2);
			System.out.println("Marks in Maths is-"+mark3);
			System.out.println("Total Marks is-"+totalMarks);
			
		}
}
		
		

	


