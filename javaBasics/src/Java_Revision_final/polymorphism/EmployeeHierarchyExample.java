package Java_Revision_final.polymorphism;

public class EmployeeHierarchyExample {
	public static void main(String[] args) {
        Employee manager = new Manager("John", 5000, 1000);
        Employee engineer = new Engineer("Jane", 4000, "Software Engineering");
        Employee salesperson = new Salesperson("Mike", 3000, 500);

        // Polymorphic behavior
        Employee[] employees = {manager, engineer, salesperson};

        for (Employee employee : employees) {
            employee.calculateSalary();
            employee.displayInfo();
            System.out.println();
        }
    }

}
