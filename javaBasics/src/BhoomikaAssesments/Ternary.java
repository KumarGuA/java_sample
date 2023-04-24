package BhoomikaAssesments;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 5, b = 10, c = 15,large,small;
			large = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
			System.out.println("Largest number is = " + large);
			small=(a < b) ? (a <c ? a : c) : (b > c ? b : c);
			System.out.println("Smallest number is = " + small);
		
	}

}
