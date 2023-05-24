package ControlStatements.BhoomikaAssesments;

class Vehiclee{

	public void Drive() {
		System.out.println("Vehicles are used for Transportation");
	}
}
class Cars extends Vehiclee {
	public void Drive() {
		System.out.println("Car has 4 wheels");
	}
}
class MotorCycle extends Vehiclee {
	public void Drive() {
		System.out.println("MotorCycle has 2 wheels");

	}
}

public class VehiclesPolymorhism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiclee Vehicles[] = new Vehiclee[2];
		Vehicles[0]=new Cars();
		Vehicles[1]=new MotorCycle();
		for(int i=0; i<Vehicles.length;i++) {
			Vehicles[i].Drive();
		}
	}

}
