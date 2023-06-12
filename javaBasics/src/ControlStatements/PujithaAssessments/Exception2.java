package ControlStatements.PujithaAssessments;

import java.util.Scanner;

class ArrayExcep {

	public void outOfBound(int[] arr) {
		try {
			System.out.println(arr[arr.length]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please access array elements within the given range: " + e);
		}
	}
}

public class Exception2 {

	public static void main(String[] args) {

		ArrayExcep ae1 = new ArrayExcep();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Emter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ae1.outOfBound(arr);
	}
}
