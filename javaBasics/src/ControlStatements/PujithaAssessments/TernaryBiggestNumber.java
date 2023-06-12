package ControlStatements.PujithaAssessments;

public class TernaryBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c = 40;

		int biggestNum = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(biggestNum);

	}

}
