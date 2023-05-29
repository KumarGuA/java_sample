package ControlStatements.SavitaAssessments;

public class VowelsandConsonants {

	public static void main(String[] args) {
		String line1 = "STRING,ARRAY";

		int vowels = 0, consonants = 0;

		line1 = line1.toLowerCase();

		for (int i = 0; i < line1.length(); ++i) {
			char ch = line1.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vowels;
			}

			else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			}

		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

	}
}
