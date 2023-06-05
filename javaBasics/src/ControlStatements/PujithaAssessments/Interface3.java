package ControlStatements.PujithaAssessments;

//Create an interface Bank with methods deposit(), withdraw(), and getBalance(). 
//Create a class SavingsAccount that implements the Bank interface. 
//Implement the methods such that calling deposit() and withdraw() updates the account balance, and calling getBalance()
//returns the current balance.

interface Bank{
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
}

class SavingsAccount1 implements Bank{
	
	double balance;
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited "+amount+" rupees. Current Balance is: "+balance);
	}
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdrawn "+amount+" rupees. Current Balance is: "+balance);

	}
	public double getBalance() {
		System.out.println("Current available balance: "+balance);
		return balance;
	}
}

public class Interface3 {

	public static void main(String[] args) {
		Bank b = new SavingsAccount1();
		b.deposit(1000);
		b.withdraw(500);
		b.getBalance();
	}

}
