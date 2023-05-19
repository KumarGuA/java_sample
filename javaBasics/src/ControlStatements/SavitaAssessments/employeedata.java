package ControlStatements.SavitaAssessments;

public class employeedata {

	String name;
	String PrimarySkill;
	String About;
	String Ph;
	static int id;
	{
		id++;

	}

	public employeedata() {
		System.out.println("I am the resource of XYZ company");
		About = "Hi, I am exicited to work here...";
	}

	public employeedata(String n, String ph) {
		System.out.println("This is welcome msg");
		name = n;
		Ph = ph;
	}

	public void setdetails(int id, String ps, String About) {

		this.id = id;
		PrimarySkill = ps;
		this.About += About;

	}

	public void setdetails(String n, int id, String ps, String About, String ph) {

		name = n;
		this.id = id;
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

	// public class Sample {

	// Class contains
	// 1. Variables/states
	// 2. Methods/Behaviors : AccessModifier ReturnType
	// methodName(Parameters/arguments)

	// Constructor : AccessModifer ClassName(Parameters/Arguments)
	// What? - syntax, initialize values
	// Why?
	// Where & how?

	// 1. Default constructor - Done
	// 2. No-Arg Constructor - Done
	// 3. Parameterized constructor - Done

	public static void main(String[] args) {

		employeedata e1 = new employeedata("Avinash", "987987987987");
		e1.setdetails(id, "UI Automation", "Blah Blah Blah...");
		e1.printDetails();

		System.out.println("--------------------------");

		employeedata e2 = new employeedata("Savitha", "9898676567897");
		e2.setdetails(id, "Security Testing", "Blah Blah Blah...");
		e2.printDetails();

		System.out.println("--------------------------");

		employeedata e3 = new employeedata();
		e3.setdetails("Priyanka", id, "Performance Testing", "lsakdlksajdlkas", "3984732987");
		e3.printDetails();

	}

}
