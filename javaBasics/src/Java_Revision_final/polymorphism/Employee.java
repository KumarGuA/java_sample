package Java_Revision_final.polymorphism;

public class Employee {
	
	    private String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public void calculateSalary() {
	        // Calculation logic specific to each subclass
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Salary: $" + salary);
	    }
}
