package Arrays;

public class JavaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// one dimensional array
//		Declaration
//		int number[];
//		int[] number1;
//		int arrayname[ ] = new int[10];

		// array declaration ,instantiated and initialization
//		int number[] = { 11, 22, 33, 44, 55 };
//		
		String name[] = { "pujitha","priyanka","savitha","Bhoomika"};
//
//		// System.out.println(number[2]);
//		// print array elements
//
//		for (int i = 0; i < number.length; i++) {
//			System.out.println("number[" + i + "] :" + number[i]);
//
//		}
//		
//		for (int i = 0; i < name.length; i++) {
//			System.out.println("name ["+name[i]+"]");
//		}
		// iterating using foreach loop
		for (String str: name)
		{
			System.out.println(str+" ");
		}

		// two dimensional array

		// two rows and three columns
//		int arr[][] = { { 11, 22, 33 }, { 44, 55, 66 } };
//
//		// outer loop 0 till number of rows
//		for (int i = 0; i <2; i++) {
//
//			// inner loop from 0 till number of columns
//
//			for (int j = 0; j < 3; j++) {
//
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//
//		}

		//

	}

}
