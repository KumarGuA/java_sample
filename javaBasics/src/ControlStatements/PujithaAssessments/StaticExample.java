package ControlStatements.PujithaAssessments;

class employee {
	
	String name;
	static int id=0;
	String PrimarySkill;
	String About;
	String Ph;
	
	public employee() {
		System.out.println("I am the resource of XYZ company");
		About = "Hi, I am exicited to work here...";
	}
	
	public employee(String n, String ph) {
		System.out.println("This is welcome msg");
		name = n;
		Ph = ph;
	}
	
	public void setdetails( String ps, String About) {
		
		id += 1;
		PrimarySkill = ps;
		this.About += About;
	
	}
	
	public void setdetails(String n, String ps, String About, String ph) {
		
		name = n;
		id+=1;
		PrimarySkill = ps;
		this.About += About;
		Ph = ph;
	}
	
	public void printDetails() {
		System.out.println("Name - "+name);
		System.out.println("ID - "+id);
		System.out.println("Primary Skill - "+PrimarySkill);
		System.out.println("About - "+About);
		System.out.println("Ph - "+Ph);
	}
	
}


public class StaticExample {
	
	//Class contains
	// 1. Variables/states
	// 2. Methods/Behaviors : AccessModifier ReturnType methodName(Parameters/arguments)
	
	//Constructor : AccessModifer ClassName(Parameters/Arguments)
	  // What? - syntax, initialize values 
		// Why?
		// Where & how?
	
	//1. Default constructor - Done
	//2. No-Arg Constructor - Done
	//3. Parameterized constructor - Done
	
	public static void main(String[] args) {
		
		employee e1 = new employee("Avinash","987987987987");
		e1.setdetails("UI Automation", "Blah Blah Blah...");
		e1.printDetails();
		
		System.out.println("--------------------------");
		
		employee e2 = new employee("Savitha","9898676567897");
		e2.setdetails("Security Testing", "Blah Blah Blah...");
		e2.printDetails();
		
		System.out.println("--------------------------");
		
		employee e3 = new employee();
		e3.setdetails("Priyanka", "Performance Testing", "lsakdlksajdlkas", "3984732987");
		e3.printDetails();
		
		
	}
	

}
