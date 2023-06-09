package ControlStatements.PujithaAssessments;

//Create some logic which involve all access modifier (public, private, protected and default).

class ModifiersCheck {
	public int doors;
	protected int seats;
	String ac;
	private String engine;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
}

public class AccessModifier1 {

	protected int cars = 2;
	public String carName = "Audi";

	public static void main(String[] args) {
		ModifiersCheck mc = new ModifiersCheck();
		mc.doors = 4;
		mc.seats = 5;
		mc.ac = "yes";
		mc.setEngine("yes");
		System.out.println("Number of doors: " + mc.doors);
		System.out.println("Number of seats: " + mc.seats);
		System.out.println("Does car has AC: " + mc.ac);
		System.out.println("Does car has engine: " + mc.getEngine());

	}
}
