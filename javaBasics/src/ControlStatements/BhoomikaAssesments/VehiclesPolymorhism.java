package ControlStatements.BhoomikaAssesments;

class Vehicle{

	public void Drive() {
		System.out.println("Vehicles are used for Transportation");
	}
}
class Car extends Vehicle {
	public void Drive() {
		System.out.println("Car has 4 wheels");
	}
}
class MotorCycle extends Vehicle {
	public void Drive() {
		System.out.println("MotorCycle has 2 wheels");

	}
}

public class VehiclesPolymorhism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Vehicles[] = new Vehicle[2];
		Vehicles[0]=new Car();
		Vehicles[1]=new MotorCycle();
		for(int i=0; i<Vehicles.length;i++) {
			Vehicles[i].Drive();
		}
	}

}
