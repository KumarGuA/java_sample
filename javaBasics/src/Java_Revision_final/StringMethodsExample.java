package Java_Revision_final;

public class StringMethodsExample {
	
	

	public static void main(String[] args) {
		String str = "Hello, World!";

		// Length
		int length = str.length();
		System.out.println("Length: " + length);

		// without inbuilt string method

		// Character at index
		char charAt3 = str.charAt(3);
		System.out.println("Character at index 3: " + charAt3);

		// Substring
		String substring = str.substring(7);
		System.out.println("Substring from index 7: " + substring);

		// Concatenation
		String concatenation = str.concat(" Goodbye!");
		System.out.println("Concatenation: " + concatenation);

		// Index of
		int indexOfW = str.indexOf('W');
		System.out.println("Index of 'W': " + indexOfW);

		// Replace
		String replaced = str.replace('o', 'x');
		System.out.println("Replace 'o' with 'x': " + replaced);

		// Uppercase
		String uppercase = str.toUpperCase();
		System.out.println("Uppercase: " + uppercase);

		// Lowercase
		String lowercase = str.toLowerCase();
		System.out.println("Lowercase: " + lowercase);

		// Trim
		String trimmed = "   Hello, World!   ".trim();
		System.out.println("Trimmed: " + trimmed);
	}

}
