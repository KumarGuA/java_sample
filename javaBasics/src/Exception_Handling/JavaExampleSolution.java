package Exception_Handling;

import java.util.Scanner;

public class JavaExampleSolution {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first number(dividend): ");
		
		num1 = scan.nextInt();

		System.out.print("Enter second number(divisor): ");
		num2 = scan.nextInt();
		try {
			int div = num1 / num2;
			System.out.println("Quotient: " + div);
		} catch (ArithmeticException e) {
			System.out.println("Do not enter divisor as zero.");
			System.out.println("Error Message: " + e);
		}
		

	}
}
