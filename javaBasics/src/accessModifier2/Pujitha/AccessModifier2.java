package accessModifier2.Pujitha;

import ControlStatements.PujithaAssessments.AccessModifier1;

class ModifierCheck2 extends AccessModifier1 {
	int numberOfCars = cars;
	String carBrand = carName;
}

public class AccessModifier2 {
	public static void main(String[] args) {
		ModifierCheck2 mc2 = new ModifierCheck2();
		System.out.println("Total numbe rof cars: " + mc2.numberOfCars);
		System.out.println("Car Brand: " + mc2.carBrand);

	}

}
