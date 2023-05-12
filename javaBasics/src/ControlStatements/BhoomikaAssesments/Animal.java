package ControlStatements.BhoomikaAssesments;
class Animal1 {

	public void name() {
		System.out.println("Cat Name : Puff");
	}

	public void Species() {
		System.out.println("Species : Animal");
	}

	public void age() {
		System.out.println("Age : 2Yrs");
	}
}

class Cat extends Animal1 {
	public void breed() {
		System.out.println("Breed :Muchkin ");
	}
}

public class Animal 
{
	public static void main(String[] args) {

		Cat Cat1 = new Cat();

		Cat1.name();
		Cat1.Species();
		Cat1.age();
		Cat1.breed();
	}
}