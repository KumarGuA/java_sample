package accessModifierp2.bhoomika;

import accessModifierP1.bhoomika.ClassA;

public class ClassC extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj = new ClassA();
		obj.java1(); // can access public method outside of package
		// obj.java4();cannot access default method outside the package
		// obj.java2(); cannot access private method outside the package
		System.out.println(name);
		// System.out.println(age); cannot access private data member outside of package
	}

}
