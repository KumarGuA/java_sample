package ControlStatements.BhoomikaAssesments;

public class EncapuslationStudent {
	private String name;
	private String age;
	private String major;
	private int gpa = 8;

	public void setName(String Name) {
		this.name = Name;
	}

	public String getName() {
		return name;
	}

	public void setAge(String Age) {
		this.age = Age;
	}

	public String getAge() {
		return age;
	}

	public void setMajor(String Major) {
		this.major = Major;
	}

	public String getMajor() {
		return major;
	}

	public int getGPA() {
		return gpa;
	}

	public void study() {
		System.out.println("studying...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapuslationStudent obj = new EncapuslationStudent();
		obj.setName("ABC");
		System.out.println("Student name :" + obj.getName());
		obj.setAge("19 Years");
		System.out.println("Student name :" + obj.getAge());
		obj.study();
		obj.setMajor("Student is Major");
		System.out.println(obj.getMajor());
		System.out.println(obj.getGPA() + "gpa");

	}

}
