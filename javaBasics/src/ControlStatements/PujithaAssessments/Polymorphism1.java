package ControlStatements.PujithaAssessments;

class Animal1{
	void makeSound() {
		System.out.println("Different animal make different sounds");
	}
}

class Dog1 extends Animal1{
	
	@Override
	void makeSound() {
		System.out.println("Dog Sounds Bhow-Bhow");
	}
}
class Cat extends Animal1{
	@Override
	void makeSound() {
		System.out.println("Cat Sounds Meow-Meow");
	}
}

class Bird extends Animal1{
	@Override
	void makeSound() {
		System.out.println("Birds Sounds Pichk-Pichk");
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
		Animal1 animals[] = new Animal1[3];
		animals[0] = new Dog1();
		animals[1] = new Cat();
		animals[2] = new Bird();
		for(int i=0; i < animals.length ; i++) {
			animals[i].makeSound();
		}
	}
}
