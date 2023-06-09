package Exception_Handling;

import java.io.IOException;

class ThrowExample1 {
	void myMethod(int num) throws IOException, ClassNotFoundException {
		if (num == 1)
			throw new IOException("IOException Occurred");
		else
			throw new ClassNotFoundException("ClassNotFoundException");
	}
}

public class ThrowsExampleMain {
	public static void main(String args[]) {
		try {
			ThrowExample1 obj = new ThrowExample1();
			obj.myMethod(1);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
