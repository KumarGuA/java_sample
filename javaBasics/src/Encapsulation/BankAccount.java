package Encapsulation;

public class BankAccount {

	private String accountNumber;
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposite(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("Dep[osited " + amount + "into account " + accountNumber + ".");
		} else {
			System.out.println("Invalid deposite amount");
		}

	}

	public void withdraw(double amount) {
		if (amount > 0 && balance >= amount) {
			balance = balance - amount;
			System.out.println("withdrew " + amount + "from account " + accountNumber + ".");
		} else {
			System.out.println("Insufficient funds or invalid withdrawal amount");
		}

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double newBalance) {

		if (newBalance >= 0) {
			balance = newBalance;
			System.out.println();
			System.out.println("Balance updated for the account " + accountNumber + ".");
		} else {
			System.out.println("invalid balance");
		}

	}

	public String getAccountNumber() {
		return accountNumber;
	}

}
