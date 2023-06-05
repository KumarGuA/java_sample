package ControlStatements.PujithaAssessments;


class Animal{
	String name;
	String species;
	int  age;
	
	void animalDetails() {
		name = "chow chow";
		species = "bhow bhow";
		age = 5;
	}
}

class Dog extends Animal{
	String breed;
	
	void animalBreed() {
		breed = "shitzu";
		System.out.println("species: "+species+", name: "+name+", age: " + age+", breed: " + breed);
	}
}

public class inheritance2 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.animalDetails();
		d.animalBreed();
	}

}
