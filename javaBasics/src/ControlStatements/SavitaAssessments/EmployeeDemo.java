package ControlStatements.SavitaAssessments;

class Employee5 {
	private String name;
	private int age;
	private float salary;

	public String getName() {
		return name;
	}

	public void setName(String N) {
		this.name = N;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int A) {
		age = A;
	}

	public float getSalary() {
		return salary;
	}

	public void setsalary(double d) {
		salary = (float) d;
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee5 obj = new Employee5();
		obj.setName("savita");
		System.out.println(obj.getName());
		obj.setAge(25);
		System.out.println(obj.getAge());
		obj.setsalary(50000.00);
		System.out.println(obj.getSalary());

	}
}
