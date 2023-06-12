package ControlStatements.BhoomikaAssesments;

class Shape1 {

	public void color() {
		System.out.println("Color : Orange");
	}

	public void size() {
		System.out.println("Size : 12cm");
	}

}

class Square extends Shape1 {
	public void side_length() {
		int side_length = 3;
		int area = (side_length * 4);
		System.out.println("Square length per side : " + side_length + "cm");
		System.out.println("Total area of square is : " + area);
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square l = new Square();
		l.color();
		l.size();
		l.side_length();

	}

}
