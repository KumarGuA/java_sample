package ControlStatements.PriyankaAssessments;

public class Student1 {

	private String name;
	private int age;
	private String major;
	private String gpa = "Grade Point Average";

	public String getName() {
		return name;
	}

	public void setName(String Name) {
		this.name = Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int Age) {
		age = Age;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String Major) {
		this.major = Major;
	}

	public String getGpa() {
		return gpa;
	}

	public void Study() {
		System.out.println("Studying...");
	}

}
