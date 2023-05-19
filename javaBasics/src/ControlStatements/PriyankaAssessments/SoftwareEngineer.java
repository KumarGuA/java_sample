package ControlStatements.PriyankaAssessments;



interface Employee {
	public void calculateSalary();

public void getEmployeeDetails();
}

interface Manager {
	public void approveLeave();
}

interface Engineer {
public void writeCode();
}

public class SoftwareEngineer implements Employee,Manager,Engineer {
	
	


	@Override
	public void writeCode() {
		System.out.println("writeCode");
		
	}

	@Override
	public void approveLeave() {
		System.out.println("leave is Approved");
		
	}

	@Override
	public void calculateSalary() {
		int salary=60000;
	int annualsalary=salary*12;
	 System.out.println("yearly salary is: "+annualsalary);
	
	}

	@Override
	public void getEmployeeDetails() {
		String Name="priyanka";
		String Employeeid="676789";
		String Skills="Testing";
		System.out.println("Employee Name is : "+Name);
		System.out.println("Employee id is : "+Employeeid);
		System.out.println("Employee Skills are : "+Skills);
		
		
				
		
	}
	 public static void main(String[] args) {
		 SoftwareEngineer obj=new SoftwareEngineer();
		 obj.approveLeave();
		 obj.calculateSalary();
		 obj.writeCode();
		 obj.getEmployeeDetails();
		 
	 }
}
	

	
	
	