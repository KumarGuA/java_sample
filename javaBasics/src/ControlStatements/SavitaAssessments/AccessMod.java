package ControlStatements.SavitaAssessments;

class savita {
	private String name = "Nexon";
	private int number = 1234;

	{
		System.out.println("Car name is :" + name);
		System.out.println("Car number is :" + number);
	}

	protected void start() {
		System.out.println("Start the vehicle");

	}

	public static void accelerate() {
		System.out.println("Give the accelerate");

	}

	protected void stop() {
		System.out.println("Vehicle should get stopped");

	}

}

public class AccessMod extends savita

{

	public static void main(String[] args) {

		AccessMod AccMd = new AccessMod();
		AccMd.start();
		AccMd.accelerate();
		AccMd.stop();

	}

}
