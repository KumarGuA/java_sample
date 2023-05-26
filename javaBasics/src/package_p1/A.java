package package_p1;

public class A {

	private void Name() {

		System.out.println("Priyanka");

	}

	protected void m1() {

		System.out.println("This is sample message");

	}

	public void Age() {

		int age = 25;

		System.out.println("yearly Age is: " + age);

	}

	void default1() {

		String skills = "Testing";

		System.out.println("Primary skills: " + skills);

	}

	public static void main(String[] args) {

		A obj = new A();

		obj.Name();

		obj.default1();
	}

}
