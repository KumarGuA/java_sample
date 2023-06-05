package ExceptionHandling.savita;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionhandling {

	int a[] = { 6, 7, 8, 9 };
	int div;

	void arithmaticexception() {
		try {
			div = (a[0] / 0);
			System.out.println(a[6]);
		} catch (ArithmeticException e) {
			System.out.println("Exception: ArithmeticException");
		}
	}

	void arrayindex() {
		try {
			System.out.println(a[6]);

		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Exception: ArrayIndexOutOfBoundsException");
		}
	}

	void NullPointerException() {
		try {
			// a[2]= (Integer) null;
			String myStr = null;

			System.out.println(myStr.length());
		} catch (NullPointerException npe) {
			System.out.println("Exception: NullPointerException");
		}
	}

	void FileNotFound() {

		try {
			FileInputStream fis = new FileInputStream("java.txt");

		} catch (FileNotFoundException fnfe) {

			System.out.println("Exception: FileNotFoundException");
		}
	}

	void CustomException() {
		try {

			Object a = null;
			throw new Exception();
		} catch (Exception ex) {
			System.out.println("This is User Defined Exception");

		}
	}

	void NumberFormatException() {
		try {
			Integer.parseInt(null);
		} catch (NumberFormatException npe) {
			System.out.println("Exception: NumberFormatException");
		}
	}

	public static void main(String[] args) {

		Exceptionhandling expn = new Exceptionhandling();
		expn.arithmaticexception();
		expn.arrayindex();
		expn.NullPointerException();
		expn.FileNotFound();
		expn.CustomException();
		expn.NumberFormatException();
	}
}
