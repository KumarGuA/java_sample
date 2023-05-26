package accessModifierP1.bhoomika;

public class ClassA {

	protected static String name = "xyz";
	private static int age = 12;

	public void java1() {
		System.out.println("public method");
	}

	protected void java2() {
		// TODO Auto-generated method stub
		System.out.println("private method");
	}

	protected void java3() {
		System.out.println("protected method");
	}

	void java4() {
		System.out.println("default method");
	}

	public static void main(String args[]) {
		ClassA obj1 = new ClassA();
		obj1.java1();
		obj1.java2();
		obj1.java3();
		System.out.println(name);
		System.out.println(age);
	}

}
