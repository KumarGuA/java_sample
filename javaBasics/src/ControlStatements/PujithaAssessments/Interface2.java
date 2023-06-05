package ControlStatements.PujithaAssessments;

//Create an interface Vehicle with methods start(), accelerate(), and stop(). 
//Create two more interfaces, Convertible with a method openRoof() and Electric with a method chargeBattery(). 
//Implement all three interfaces in a class Car. 
//Write a program to create objects of different car types and invoke the methods based on their respective interfaces.

interface Vehicle1{
	void start();
	void accelerate();
	void stop();
}

interface Convertible{
	void openRoof();
}

interface Electric{
	void chargeBattery();
}

class car1 implements Vehicle1, Convertible, Electric{
	public void start() {
		System.out.println("starts the engine");
	}
	public void accelerate() {
		System.out.println("Accelerates the engine");
	}
	public void stop() {
		System.out.println("stops the engine");
	}
	public void openRoof() {
		System.out.println("Audi has open Roof top");
	}
	public void chargeBattery() {
		System.out.println("Electric car doesn't require petrol");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		Vehicle1 maruthi = new car1();
		maruthi.start();
		maruthi.accelerate();
		maruthi.stop();
		Convertible audi = new car1();
		audi.openRoof();
		Electric ola = new car1();
		ola.chargeBattery();
	}

}
