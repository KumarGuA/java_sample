package ControlStatements.PujithaAssessments;

class shape {

	String color;
	int size;

	void shapeColor(String color) {
		this.color = color;
		System.out.println("shape color is: " + color);
	}

	void shapeArea(int size) {
		this.size = size;
		System.out.println("Entered Size for area: " + size);
	}

	void shapePerimeter(int size) {
		this.size = size;
		System.out.println("Entered size fo perimeter: " + size);
	}

}

class square extends shape {

	int sideLength;

	void calculateArea() {
		sideLength = size;
		int area = sideLength * sideLength;
		System.out.println("Area of square: " + area);
	}

	void calculatePerimeter() {
		sideLength = size;
		int perimeter = 4 * sideLength;
		System.out.println("Perimeter of square: " + perimeter);
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		square s = new square();
		s.shapeColor("Black");
		s.shapeArea(4);
		s.shapePerimeter(4);
		s.calculateArea();
		s.calculatePerimeter();
	}

}
