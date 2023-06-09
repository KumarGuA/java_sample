package ControlStatements.BhoomikaAssesments;

interface Employee {
	void calculatesalary();

	void getEmployeeDetails();
}

interface Manager {
	void approveLeave();

}

interface Engineer {
	void writeCode();
}

public class InterfaceSoftwareEngineer implements Employee, Manager, Engineer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceSoftwareEngineer obj = new InterfaceSoftwareEngineer();
		obj.approveLeave();
		obj.calculatesalary();
		obj.getEmployeeDetails();
		obj.writeCode();
	}

	@Override
	public void writeCode() {
		// TODO Auto-generated method stub

		System.out.println("Interface program");

	}

	@Override
	public void approveLeave() {
		// TODO Auto-generated method stub
		System.out.println("Leave request has been approved");

	}

	@Override
	public void calculatesalary() {
		// TODO Auto-generated method stub
		int sal = 4000;
		int ttlsal = sal * 12;
		System.out.println("Total salary of Employee per year is" + ttlsal);
	}

	@Override
	public void getEmployeeDetails() {
		// TODO Auto-generated method stub
		System.out.println("Employee Name : Bhoomika \nEmployee ID : 528929 \nDOJ : May 20th");
	}

}
