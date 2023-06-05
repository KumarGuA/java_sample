package ControlStatements.BhoomikaAssesments;

public class StringIntToArrayForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = { 2, 6, 2, 5, 6 };

		String name[] = { "Dog", "Cat", "Bird" };

		System.out.println("int to array using for loop \n----------------------------------");
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		System.out.println("int to array using foreach loop \n----------------------------------");
		for (int n : number) {
			System.out.println(n);
		}
		System.out.println("String to array using for loop \n----------------------------------");
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		System.out.println("String to array using foreach loop \n----------------------------------");
		for (String str : name) {
			System.out.println(str);
		}

	}

}
