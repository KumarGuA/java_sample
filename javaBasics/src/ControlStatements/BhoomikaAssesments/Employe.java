package ControlStatements.BhoomikaAssesments;

public class Employe {

	static int id = 0;
	{
		id++;
	}
	String name;
	String PrimarySkill;
	String About;
	String Ph;

	public Employe() {
		System.out.println("I am the resource of XYZ company");
		About = "Hi, I am exicited to work here...";
	}

	public Employe(String n, String ph) {
		System.out.println("This is welcome msg");
		name = n;
		Ph = ph;
	}

	public void setdetails(int id, String ps, String About) {

		Employe.id = id;
		PrimarySkill = ps;
		this.About += About;

	}

	public void setdetails(String n, int id, String ps, String About, String ph) {

		name = n;
		Employe.id = id;
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

		Employe e1 = new Employe("Avinash", "987987987987");
		e1.setdetails(id, "UI Automation", "Blah Blah Blah...");
		e1.printDetails();

		System.out.println("--------------------------");

		Employe e2 = new Employe("Savitha", "9898676567897");
		e2.setdetails(id, "Security Testing", "Blah Blah Blah...");
		e2.printDetails();

		System.out.println("--------------------------");

		Employe e3 = new Employe();
		e3.setdetails("Bhoomika", id, "Performance Testing", "lsakdlksajdlkas", "3984732987");
		e3.printDetails();

	}

}
