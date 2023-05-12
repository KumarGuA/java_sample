package ControlStatements.SavitaAssessments;
class Animal {

	public void name() {
		System.out.println("My name is dog");
	}

	public void Species() {
		System.out.println("Species is Breed");
	}

	public void age() {
		System.out.println("age is 6");
	}
}

class Cat extends Animal {
	public void breed() {
		System.out.println("breed is Abyssinian");
	}
}

public class Animal1 
{
	public static void main(String[] args) {

		Cat Cat1 = new Cat();

		Cat1.name();
		Cat1.Species();
		Cat1.age();
		Cat1.breed();
	}
}
