package ControlStatements.PujithaAssessments;

class ArithException{
	
	public void divideByZero(int numerator, int denominator) {
		int result;
		try {
			result = numerator/denominator;
		} catch (ArithmeticException ae) {
			System.out.println("Cna't divide a number by Zero "+ae);
		}
	}
}

public class Exception1 {

	public static void main(String[] args) {
		ArithException aex = new ArithException();
		aex.divideByZero(5,0);
	}
}
