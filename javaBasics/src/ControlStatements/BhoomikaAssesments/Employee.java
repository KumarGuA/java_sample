package ControlStatements.BhoomikaAssesments;

public class Employee {
	

	static int id=0;
	{
		id++;
	}
	String name;
	String PrimarySkill;
	String About;
	String Ph;
	

	public Employee() {
		System.out.println("I am the resource of XYZ company");
		About = "Hi, I am exicited to work here...";
	}

	public Employee(String n, String ph) {
		System.out.println("This is welcome msg");
		name = n;
		Ph = ph;
	}

	public void setdetails(int id, String ps, String About) {

		Employee.id = id;
		PrimarySkill = ps;
		this.About += About;

	}

	public void setdetails(String n, int id, String ps, String About, String ph) {

		name = n;
		Employee.id = id;
		PrimarySkill = ps;
		this.About += About;
		Ph = ph;
	}

	public void printDetails() {
		System.out.println("Name - " + name);
		System.out.println("ID - " + id);
		System.out.println("Primary Skill - " + PrimarySkill);
		System.out.println("About - " + About);
		System.out.println("Ph - " + Ph);
	}


	public static void main(String[] args) {

		Employee e1 = new Employee("Avinash", "987987987987");
		e1.setdetails(id, "UI Automation", "Blah Blah Blah...");
		e1.printDetails();

		System.out.println("--------------------------");

		Employee e2 = new Employee("Savitha", "9898676567897");
		e2.setdetails(id, "Security Testing", "Blah Blah Blah...");
		e2.printDetails();

		System.out.println("--------------------------");

		Employee e3 = new Employee();
		e3.setdetails("Bhoomika", id, "Performance Testing", "lsakdlksajdlkas", "3984732987");
		e3.printDetails();

	}

}
