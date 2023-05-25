package ControlStatements.BhoomikaAssesments;

public class Emp {
	private String name;
	private int age;
	private int salary;
	

public String getName() {
	
	return name;
}
public void setName(String Name) {
	this.name=Name;
	
}

public int getAge() {
	
	return age;
}
public void setAge(int Age) {
	this.age=Age;	
}

public int getSalary() {
	
	return salary;
}
public void setSalary(int Salary) {
	this.salary=Salary;	
}

public static void main(String args[]) {

	Emp obj =new Emp();
	obj.setName("xyz");
	System.out.println("Name of employee :"+obj.getName());
	obj.setAge(20);
	System.out.println("Age of employee :"+obj.getAge());
	obj.setSalary(20000);
	System.out.println("Salary of employee :"+obj.getSalary());	
}
}
