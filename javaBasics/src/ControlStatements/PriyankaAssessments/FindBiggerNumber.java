package ControlStatements.PriyankaAssessments;

public class FindBiggerNumber {

	public static void main(String[] args) {

		int a = 10, b = 20, c = 40, max;
		max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

		// Print the largest number
		System.out.println("Maximum number among " + a + ", " + b + " and " + c + " is " + max);
	}
}