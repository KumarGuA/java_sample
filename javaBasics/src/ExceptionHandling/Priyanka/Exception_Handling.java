package ExceptionHandling.Priyanka;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_Handling {

	int a[] = { 1, 2, 3 };
	int div;

	void arithmaticexception() {
		try {
			div = (a[0] / 0);
			System.out.println(a[7]);
		} catch (ArithmeticException e) {
			System.out.println("Warning: ArithmeticException");
		}
	}

	void arrayindex() {
		try {
			System.out.println(a[7]);

		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		}
	}

	void NullPointerException() {
		try {
			// a[2]= (Integer) null;
			String myStr = null;

			System.out.println(myStr.length());
		} catch (NullPointerException npe) {
			System.out.println("Warning: NullPointerException");
		}
	}

	void FileNotFound() {

		try {
			FileInputStream file = new FileInputStream("java.txt");

		} catch (FileNotFoundException fnfe) {

			System.out.println("Warning: FileNotFoundException");
		}
	}

	void CustomException() {
		try {
			// Throw an object of user defined exception
			Object p = null;
			throw new Exception();
		} catch (Exception ex) {
			System.out.println("This is User Defined Exception");

		}
	}

	void NumberFormatException() {
		try {
			Integer.parseInt(null);
		} catch (NumberFormatException npe) {
			System.out.println("warining: NumberFormatException");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception_Handling obj = new Exception_Handling();
		obj.arithmaticexception();
		obj.arrayindex();
		obj.NullPointerException();
		obj.FileNotFound();
		obj.CustomException();
		obj.NumberFormatException();
	}

}
