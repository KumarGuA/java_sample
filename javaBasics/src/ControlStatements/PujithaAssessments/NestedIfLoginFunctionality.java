package ControlStatements.PujithaAssessments;

public class NestedIfLoginFunctionality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "Abc";
		String password = "Abc@123";
		
		if(username.equals("Abc"))
		{
			if(password.equals("Abc@123"))
				System.out.println("Login Successful");
			else
				System.out.println("Password is incorrect");
		}
		else if(!username.equals("Abc") && !password.equals("Abc@123"))
			System.out.println("Both username and password are incorrect");
		else
			System.out.println("Username is incorrect");
	}
}
