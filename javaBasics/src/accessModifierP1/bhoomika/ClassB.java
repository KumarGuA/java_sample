package accessModifierP1.bhoomika;

public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA obj2 = new ClassA();
		obj2.java2(); // can access private method in different class under same package
		obj2.java3(); // can access protected method in different class under same package
		obj2.java1();// can access public method in different class under same package
		obj2.java4(); // can access public method in different class under same package
		System.out.println(name); // can access private data member outside the class
		// System.out.println(age); cannot access private data member outside the class
	}

}
