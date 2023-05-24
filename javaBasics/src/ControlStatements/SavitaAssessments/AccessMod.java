package ControlStatements.SavitaAssessments;

class savita {
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
