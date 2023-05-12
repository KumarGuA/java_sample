package ControlStatements.SavitaAssessments;

class Animal2 {

	public void Makesound() {
		System.out.println("Animals making a diff sound");

	}

}

class Dog extends Animal2 {
	public void Makesound() {
		System.out.println("Dog is barking");
	}
}

class Cow extends Animal2 {
	public void Makesound() {
		System.out.println("Cow is making sound");

	}
}

class Bird extends Animal2 {
	public void Makesound() {
		System.out.println("Bird is making sound");

	}
}

public class Animals {
	public static void main(String args[]) {
		Animal2 Dog = new Dog();
		Animal2 Cow = new Cow();
		Animal2 Bird = new Bird();
		Dog.Makesound();
		Cow.Makesound();
		Bird.Makesound();
	}
}