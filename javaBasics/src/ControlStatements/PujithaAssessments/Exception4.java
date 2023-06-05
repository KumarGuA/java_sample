package ControlStatements.PujithaAssessments;

class NumExcep{
	public void numformat(String str) {
		try {
			int i= Integer.parseInt(str);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("Please enter proper number based on it's type: "+e);
		}
	}
}

public class Exception4 {

	public static void main(String[] args) {
		NumExcep ne = new NumExcep();
		ne.numformat("hey");
	}
}
