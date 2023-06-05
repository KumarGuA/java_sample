package ControlStatements.PujithaAssessments;

//Create a class called Employee with private instance variables name, age, and salary. 
//Implement public getter and setter methods for each     variable. 
//In the Main class, create an object of the Employee class and demonstrate the use of getter and setter methods 
//to set and retrieve employee information.

class Employee2{
	private String name;
	private int age;
	private double salary;
	
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
}

public class Encapsulation1 {

	public static void main(String[] args) {
		Employee2 e = new Employee2();
		e.setName("xyz");
		System.out.println("Employee Name: "+e.getName());
		e.setAge(10);
		System.out.println("Employee Age: "+e.getAge());
		e.setSalary(9000);
		System.out.println("Employee Salary: "+e.getSalary());
	}

}
