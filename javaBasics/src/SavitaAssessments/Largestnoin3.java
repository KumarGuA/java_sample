package SavitaAssessments;

public class Largestnoin3 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 40;
		int biggest;
		if (a > b) {
			if (a > c) {
				biggest = a;
			} else {
				biggest = c;
			}
		} else {
			if (b > c) {
				biggest = b;
			} else {
				biggest = c;
			}
		}
		System.out.println("biggest number :" + biggest);
 
	}
}

