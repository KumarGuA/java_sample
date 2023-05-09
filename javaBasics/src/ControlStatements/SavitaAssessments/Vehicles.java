package ControlStatements.SavitaAssessments;

class Vehicle1 {

	public void Drive() {

		System.out.println("Vehicles can move");

	}
}

class Car extends Vehicle1 {
	public void Drive() {
		System.out.println("Car can be moveable");
	}
}

class MotorCycle extends Vehicle1 {
	public void Drive() {
		System.out.println("MotorCycle can be moveable");

	}
}

public class Vehicles {

	public static void main(String[] args) {

		Vehicle1 Car = new Car();
		Vehicle1 MotorCycle = new MotorCycle();
		Car.Drive();
		MotorCycle.Drive();

	}

}
