package ControlStatements.PujithaAssessments;

class InvalidNumberException extends Exception{
	InvalidNumberException(String message) {
		super(message);
	}
}

class HandleCustomExecp{
	public void positiveNums(int num) throws InvalidNumberException {
		if(num>0) {
			num+=num;
		}
		else {
			throw new InvalidNumberException("Number should be greater than zero");
		}
		System.out.println(num);
	}
}


public class Exception5 {

	public static void main(String[] args) {
		HandleCustomExecp hce = new HandleCustomExecp();
		try {
			hce.positiveNums(2);
			hce.positiveNums(-1);
		} catch (InvalidNumberException e) {
			System.out.println(e.getMessage());
		}
	}

}
