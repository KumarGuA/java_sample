package BhoomikaAssesments;

public class CalculatorFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option = 3;
		int a = 8, b = 4;
		int add, sub, div, mul;
		add = a + b;
		sub = a - b;
		mul = a * b;
		div = a / b;
		switch (option) {
		case 1:
			System.out.println("Addition of 2 number is :" + add);
			break;
		case 2:
			System.out.println("Substraction of 2 number is :" + sub);
			break;
		case 3:
			System.out.println("Multiplication of 2 number is :" + mul);

			break;
		case 4:
			System.out.println("division of 2 number is :" + div);
			break;
		default:
			System.out.println("Invalid functionality");

		}

	}
}
