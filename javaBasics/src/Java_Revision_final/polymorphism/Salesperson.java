package Java_Revision_final.polymorphism;

class Salesperson extends Employee {
    private double commission;

    public Salesperson(String name, double salary, double commission) {
        super(name, salary);
        this.commission = commission;
    }

    @Override
    public void calculateSalary() {
        // Calculation logic for Salesperson's salary including commission
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Commission: $" + commission);
    }
}
