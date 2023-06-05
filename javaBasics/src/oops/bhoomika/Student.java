package oops.bhoomika;
class Gender {
	public void gender() {
		System.out.println("Gender : Female");
	}
	
}
public class Student extends Gender {
	private String name;
	private int age;

	Student() {
		name = "noname";
		age = 1;
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void setNameAndAge(String name, int age) {
		this.name = name;
		this.age = age;

	}

	void introduce() {
		System.out.println("Name : " + name + "\nAge :" + age);
	}

}
