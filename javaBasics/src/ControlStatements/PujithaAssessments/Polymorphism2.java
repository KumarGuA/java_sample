package ControlStatements.PujithaAssessments;

class Vehicle {
	void drive() {
		System.out.println("Vehicles have tires");
	}
}

class Car extends Vehicle{
	
	@Override
	void drive() {
		System.out.println("Car has 4 tires");
	}
}

class motorCycle extends Vehicle{
	
	@Override
	void drive() {
		System.out.println("MotorCycle has 2 tires");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Vehicle vehicles[]=new Vehicle[2];
		vehicles[0] = new Car();
		vehicles[1] = new motorCycle();
		
		for(int i = 0; i<vehicles.length;i++) {
			vehicles[i].drive();
		}
	}

}
