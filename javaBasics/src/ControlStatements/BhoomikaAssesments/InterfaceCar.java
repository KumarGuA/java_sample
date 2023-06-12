package ControlStatements.BhoomikaAssesments;

interface Vehicle {
	void start();

	void accelerate();

	void stop();
}

interface Convertible {
	void openRoof();
}

interface Electric {
	void chargeBattery();
}

//Convertible with a method openRoof() and Electric with a method chargeBattery()
public class InterfaceCar implements Vehicle, Convertible, Electric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceCar obj = new InterfaceCar();
		obj.start();
		obj.openRoof();
		obj.accelerate();
		obj.stop();
		obj.chargeBattery();

	}

	@Override
	public void chargeBattery() {
		// TODO Auto-generated method stub
		System.out.println("Car has Chargable Battery");
	}

	@Override
	public void openRoof() {
		// TODO Auto-generated method stub
		System.out.println("Car has Open Roof");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Press Power Button to Start the Engine");

	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Press accelerator to increase the speed");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Long Press Power button to stop the car");

	}

}
