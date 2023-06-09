package ControlStatements.SavitaAssessments;

interface Vehicle {
	default void start() {

		System.out.println("Vehicle should get started");
	}

	default void accelerate() {
		System.out.println("Give the accelerate");

	}

	default void stop() {
		System.out.println("Vehicle should get stopped");

	}
}

interface Convertible {
	default void openRoof() {

		System.out.println("Open roof of the vehicle");

	}
}

interface Electric {
	default void chargeBattery() {
		System.out.println("Charge vehicle battery");
	}
}

public class DetailsCar implements Vehicle, Convertible, Electric {

	public static void main(String[] args) {

		DetailsCar Cardt = new DetailsCar();
		Cardt.start();
		Cardt.accelerate();
		Cardt.stop();
		Cardt.openRoof();
		Cardt.chargeBattery();

	}

}
