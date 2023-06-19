package Java_Revision_final;

public class countNumberOfWordsinString {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

	private static void method1() {
		final String str = "java developers guide";		
		String[] strArray = str.split(" ");
		System.out.println("Number of words in a string = " + strArray.length);
	}

	private static void method2() {
		final String str = "java developers guide";
		int count = 0;
		for (String word : str.split(" ")) {
			count++;
		}
		System.out.println("Number of words in a string = " + count);
	}

	private static void method3() {
		final String str = "java developers guide";

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;

			}
		}
		System.out.println("Number of words in a string = " + count);
	}
	private static void method4() {
		final String str = "java developers guide";
		//String[] strArray = str.split(" ");
		System.out.println("Number of words using inbuilt string method= " + str.length());
		int count=0;
		
		for(char ch: str.toCharArray())
		{
			 count++;
		}
		//System.out.println("Number of words without using inbuilt string method = "+count+"::"+count1);
		
	}
}
