package ControlStatements.SavitaAssessments;

public class Stringarray {

	public static void main(String[] args) {
		String[] arr = { "Apple", "Banana", "Orange" };

		for (String i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int i = 0;
		while (i < arr.length) {
			System.out.print(arr[i] + " ");
			i++;
		}
		System.out.println();
	}
}
