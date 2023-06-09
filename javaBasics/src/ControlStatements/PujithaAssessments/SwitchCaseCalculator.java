package ControlStatements.PujithaAssessments;

public class SwitchCaseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5, option = 4;

		switch (option) {
		case 1: {
			System.out.println("add = " + (a + b));
			break;
		}
		case 2: {
			System.out.println("diff = " + (a - b));
			break;
		}
		case 3: {
			System.out.println("pdt = " + (a * b));
			break;
		}
		case 4: {
			System.out.println("quo = " + (a / b));
			break;
		}
		case 5: {
			System.out.println("rem = " + (a % b));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}
}
