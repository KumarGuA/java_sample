package ControlStatements.SavitaAssessments;

class studentS{
	private String name;
	private int age;
	private String major;
	private String gpa= "Sahasra";
	public String getName() {
		return name;
	}

	public void setName(String N) {
		this.name = N;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int A) {
		age = A;
	}
	public String getMajor() {
		return major;
	}

	public void setMajor(String M) {
		this.major = M;
	}
	public String getGpa() {
		return gpa;
	}
	public void Study() {
		System.out.println("Studying...");
	}

}

public class studentinf {

	public static void main(String[] args) {
		studentS obj=new studentS();
		obj.setName("Savita");
		System.out.println(obj.getName());
		obj.setAge(26);
		System.out.println(obj.getAge());
		obj.setMajor("yes");
		System.out.println(obj.getMajor());
		System.out.println(obj.getGpa());
		obj.Study();

	}

}
