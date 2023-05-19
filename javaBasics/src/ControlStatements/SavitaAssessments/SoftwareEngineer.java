package ControlStatements.SavitaAssessments;

interface Employee {
	default void CalculateSalary() {
		int salary = 50000;
		System.out.println("calculate the employee salary: " + salary);
	}

	default void getEmployeeDetails() {
		String name = "Savita";
		int EmpID = 309073;
		String Cmpname = "Unisys";
		String org = "ECS";
		System.out.println("Name of the empoyee: " + name);
		System.out.println("ID of the empoyee: " + EmpID);
		System.out.println("Company name of the empoyee: " + Cmpname);
		System.out.println("Organizatio of the empoyee: " + EmpID);
	}
}

interface Manager {
	default void approveLeave() {

		System.out.println("Kindly approve the leave");

	}
}

interface Engineer {
	default void writeCode() {
		System.out.println("Write a java code");
	}
}

public class SoftwareEngineer implements Employee, Manager, Engineer {

	public static void main(String[] args) {

		SoftwareEngineer softeng = new SoftwareEngineer();
		softeng.CalculateSalary();
		softeng.getEmployeeDetails();
		softeng.approveLeave();
		softeng.writeCode();

	}

}
