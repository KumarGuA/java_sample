package ControlStatements.PriyankaAssessments;

public class StudInfo {

	public static void main(String[] args) {
		Student1 obj = new Student1();
		obj.setName("Priyanka");
		System.out.println(obj.getName());
		obj.setAge(30);
		System.out.println(obj.getAge());
		obj.setMajor("yes");
		System.out.println(obj.getMajor());
		System.out.println(obj.getGpa());
		obj.Study();

	}

}
