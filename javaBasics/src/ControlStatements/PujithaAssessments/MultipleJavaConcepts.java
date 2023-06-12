package ControlStatements.PujithaAssessments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StringToChar {
	public void strToChar(String str) {
		List<Character> chars = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			chars.add(str.charAt(i));
		}
		System.out.println(chars);
	}
}

class ForArray {
	public void stringArray(String[] strArr) {
		System.out.println("For Loop:");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

	public void intArray(int[] intArr) {
		System.out.println("For Loop:");
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}
}

class ForEachArray extends ForArray {
	@Override
	public void stringArray(String[] strArr) {
		System.out.println("ForEach Loop: ");
		for (String str : strArr) {
			System.out.println(str);
		}
	}

	@Override
	public void intArray(int[] intArr) {
		System.out.println("ForEach Loop: ");
		for (int ints : intArr) {
			System.out.println(ints);
		}
	}
}

public class MultipleJavaConcepts {

	public static void main(String[] args) {
		StringToChar stc = new StringToChar();
		stc.strToChar("string");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		int size = sc.nextInt();
		int[] intarr = new int[size];
		System.out.println("Enter int array elements: ");
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = sc.nextInt();
		}
		String[] strarr = new String[size];
		System.out.println("Enter String array elements: ");
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = sc.next();
		}
		ForArray fa = new ForArray();
		fa.stringArray(strarr);
		fa.intArray(intarr);
		ForEachArray fea = new ForEachArray();
		fea.stringArray(strarr);
		fea.intArray(intarr);

	}

}
