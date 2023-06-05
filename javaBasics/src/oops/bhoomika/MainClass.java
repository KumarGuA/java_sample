package oops.bhoomika;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student bhoomika = new Student();
		Student pooja = new Student("pooja", 25);
		Student savita = new Student();
		Student[] students = new Student[3];

		students[0] = bhoomika;
		students[1] = pooja;
		students[2] = savita;
		// String students []= {"Bhoomika","pooja","savita"};
		bhoomika.setNameAndAge("Bhoomika", 25);
		students[1].setNameAndAge("Pooja", 28);
		students[2].setNameAndAge("Savita", 30);

		Student obj = new Student();

		bhoomika.introduce();
		obj.gender();
		students[1].introduce();
		obj.gender();
		savita.introduce();
		obj.gender();
	}

}
