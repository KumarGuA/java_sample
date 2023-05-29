
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = { 1, 5, 7, 9, 11 };

		try {
			for (int i = 0; i <= number.length; i++) {
				System.out.println(number[i]);
			}
		} catch (Exception ex) {
			System.out.println("error");
		}
	}

}
