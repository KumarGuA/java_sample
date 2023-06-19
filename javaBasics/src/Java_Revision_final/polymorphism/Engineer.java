package Java_Revision_final.polymorphism;

public class Engineer extends Employee {
    private String department;

    public Engineer(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void calculateSalary() {
        // Calculation logic for Engineer's salary
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
