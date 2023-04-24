package BhoomikaAssesments;

public class Largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30, b = 400, c = 50, larg;
		if (a > b) {
			if (a > c) {
				larg = a;
			} else {
				larg = c;
			}
		} else {
			if (b > c) {
				larg = b;
			} else {
				larg = c;
			}
		}
		System.out.println(" Largest number is :" + larg);
	}

}
