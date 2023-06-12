package ControlStatements.BhoomikaAssesments;

class Animal2 {
	public void Makesound() {
		System.out.println("Animals makes sound");
	}
}

class Dog extends Animal2 {
	public void Makesound() {
		System.out.println("The Dog says Bow-Bow");
	}
}

class Cat1 extends Animal2 {
	public void Makesound() {
		System.out.println("The Cat says Meow-Meow");
	}
}

class Bird extends Animal2 {
	public void Makesound() {
		System.out.println("The Birds chirps");
	}
}

public class AnimalPolymorphism {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal2 animal[] = new Animal2[3];
		animal[0] = new Dog();
		animal[1] = new Cat1();
		animal[2] = new Bird();
		for (int i = 0; i < 3; i++) {
			animal[i].Makesound();
		}

	}
}
