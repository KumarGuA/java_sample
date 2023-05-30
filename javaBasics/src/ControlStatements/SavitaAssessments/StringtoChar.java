package ControlStatements.SavitaAssessments;

public class StringtoChar {

	public static void main(String args[]) {
		String myString = "savita";
		char[] myChars = myString.toCharArray();
		for (int i = 0; i < myChars.length; i++) {
			System.out.println(myChars[i]);
		}
	}
}
