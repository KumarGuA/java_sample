package ControlStatements.PujithaAssessments;

class NullExcep {
	public void nullPoint(String str) {
		str = null;
		try {
			System.out.println("Length of the given string is: " + str.length());
		} catch (NullPointerException e) {
			System.out.println("given string is empty: " + e);
		}
	}
}

public class Exception3 {

	public static void main(String[] args) {
		NullExcep ne = new NullExcep();
		ne.nullPoint("");
	}

}
