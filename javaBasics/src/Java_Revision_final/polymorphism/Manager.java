package Java_Revision_final.polymorphism;

public class Manager extends Employee{
	
	private double bonus;

	    public Manager(String name, double salary, double bonus) {
	        super(name, salary);
	        this.bonus = bonus;
	    }

	    @Override
	    public void calculateSalary() {
	        // Calculation logic for Manager's salary including bonus
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Bonus: $" + bonus);
	    }
}
