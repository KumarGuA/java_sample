package ControlStatements.PujithaAssessments;

interface Employee1 {
	void calculateSalary();

	void getEmployeeDetails();
}

interface Manager {
	void approveLeave();
}

interface Engineer {
	void writeCode();
}

class SoftwareEngineer implements Employee1, Manager, Engineer {
	public void calculateSalary() {
		System.out.println("Salary Calculated");
	}

	public void getEmployeeDetails() {
		System.out.println("Get Employee Details");
	}

	public void approveLeave() {
		System.out.println("Approve leave");
	}

	public void writeCode() {
		System.out.println("WriteCode");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		SoftwareEngineer se = new SoftwareEngineer();
		se.calculateSalary();
		se.getEmployeeDetails();
		se.approveLeave();
		se.writeCode();
	}

}
