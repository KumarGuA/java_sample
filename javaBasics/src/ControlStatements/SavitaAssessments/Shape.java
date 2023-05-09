package ControlStatements.SavitaAssessments;

class Shape1 {

	public void color() {
		System.out.println("Color is green");
	}

	public void size() {
		System.out.println("size is 30");
	}

}

class Square extends Shape1 {
	public void side_length() {
		int length = 5;
		int side_length = length * 4;
		System.out.println("square length is: " + length);
		System.out.println("side length of square is : " + side_length);
	}
}

public class Shape {
	public static void main(String[] args) {

		Square l = new Square();
		l.color();
		l.size();
		l.side_length();

	}
}
