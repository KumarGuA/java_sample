package ControlStatements.PujithaAssessments;

//Create a class called Student with private instance variables name, age, major, and gpa. 

//Implement public getter and setter methods for name, age, and major, but provide only a getter method for gpa. 
//Additionally, implement a public method called study() that prints "Studying..." to the console. 
//In the Main class, create an object of the Student class and demonstrate the use of encapsulation by using 
//getter and setter methods to access and modify student information and by calling the study() method.

class Student1 {
	private String name;
	private int age;
	private String major;
	private double gpa = 9.06;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public double getGpa() {
		return gpa;
	}

	public void study() {
		System.out.println("Studing....");
	}
}

public class Encapsulation2 {

	public static void main(String[] args) {

		Student1 s1 = new Student1();
		s1.setName("XYZ");
		System.out.println("Student Name: " + s1.getName());
		s1.setAge(20);
		System.out.println("Student Age: " + s1.getAge());
		s1.setMajor("Java");
		System.out.println("Student major is: " + s1.getMajor());
		System.out.println("Student GPA is: " + s1.getGpa());
		s1.study();
	}

}
