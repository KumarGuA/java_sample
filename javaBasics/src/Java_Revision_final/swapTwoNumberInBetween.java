package Java_Revision_final;

public class swapTwoNumberInBetween {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		System.out.println("Before swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Swapping logic
		int temp = b;
		b = a;
		a = temp;

		System.out.println("After swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}
}
