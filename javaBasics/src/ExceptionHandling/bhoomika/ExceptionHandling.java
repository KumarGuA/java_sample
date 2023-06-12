package ExceptionHandling.bhoomika;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	int a[] = { 1, 2, 3 };
	int div;

	void arithmaticexception() {
		try {
			div = (a[0] / 0);
			System.out.println(a[7]);
		} catch (ArithmeticException ae) {
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
		// Scanner scan = new Scanner(System.in);
		// String filename = scan.nextLine();
		try {
			FileInputStream fis = new FileInputStream("java.txt");

		} catch (FileNotFoundException fnfe) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Warning: FileNotFoundException");
		}
	}
	void CustomException() {
		try {
			// Throw an object of user defined exception
			Object a = null;
			throw new Exception();
		} catch (Exception ex) {
			System.out.println("This is User Defined Exception");

		}
	}
	void NumberFormatException() {
		try {
			Integer.parseInt(null);
		}catch (NumberFormatException npe) {
			System.out.println("warining: NumberFormatException");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling obj = new ExceptionHandling();
		obj.arithmaticexception();
		obj.arrayindex();
		obj.NullPointerException();
		obj.FileNotFound();
		obj.CustomException();
		obj.NumberFormatException();
	}
}