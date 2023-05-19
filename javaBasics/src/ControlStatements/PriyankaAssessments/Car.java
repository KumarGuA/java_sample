package ControlStatements.PriyankaAssessments;

interface Vehicle {
	
	default void start() {
		
	System.out.println("Start");
		
	}
	
	default void accelerate() {
		System.out.println("accelerate");
		
	}
	
	default void stop() {
		System.out.println("Stop");
		
	}
}

interface Convertible {
	default void openRoof() {
		System.out.println("conver to open roof");
		
	}
}

interface Electric {
	default void chargeBattery() {
		System.out.println("charging");
		
	}
}

public class Car implements Vehicle, Convertible, Electric {

	public static void main(String[] args) {

		Car details=new Car();
		details.accelerate();
		details.chargeBattery();
		details.start();
		details.stop();
		details.openRoof();
		
		
	}

}


