package ControlStatements.BhoomikaAssesments;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowel = 0, consonant = 0;
		String str = "string";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				// if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
				// str.charAt(i) == 'o'
				// || str.charAt(i) == 'u') {
				vowel++;
			}

			// else if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
			// && str.charAt(i) != 'o'
			// && str.charAt(i) != 'u') {
			else if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u') {
				consonant++;
			}
		}
		System.out.println("Number of vowels: " + vowel);
		System.out.println("Number of consonants: " + consonant);
	}
}
