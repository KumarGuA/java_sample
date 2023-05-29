package Exception_Handling.nestedTryExample;

public class NestedTryBlockEx4 {

	public static void main(String[] args) {
		String str = "Scientech Easy";
		int x[] = { 0, 1, 2, 3, 4 };

		// Outer try block.
		try {
			int slength = str.length();
			System.out.println("String length: " + slength);
			// An inner try catch block inside a try block.
			try {
				int y = 6;
				System.out.println(x[y]); // Exception occurred.
			} catch (ArithmeticException ae) // No match is found.
			{
				System.out.println("Exception is thrown");
				System.out.println(ae.toString());
			}
		} catch (NullPointerException npe) // No match is found.
		{
			System.out.println("Exception is thrown ");
			System.out.println(npe.toString());
		}
		System.out.println("I am out of outer catch block");
	}
}

//In this example program, the exception thrown by inner try block 
//does not match with the type of outer and inner catch blocks. 
//Therefore, Java runtime system will handle exception at runtime and 
//the program terminates abnormally.
