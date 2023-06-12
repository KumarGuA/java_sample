package ControlStatements.PujithaAssessments;

class BankAccount {

	double balance;
	String accountNumber;

	void deposit(String accNumber, double depositAmount) {
		accountNumber = accNumber;
		balance += depositAmount;
		System.out.println("Account Number: " + accountNumber + " current available balance: " + balance);
	}

	void withdrawal(String accNumber, double withdrawAmount) {
		balance -= withdrawAmount;
		System.out.println("Account Number: " + accountNumber + " current available balance: " + balance);

	}

}

class SavingsAccount extends BankAccount {

	double interestRate;
	double minimumBalance;

	void interestCal(double interestPercentage, int timePeriod) {

		minimumBalance = balance;
		interestRate = interestPercentage;

		System.out.println("interestPercentage: " + interestRate + " Time period: " + timePeriod);
		double decimalInterest = interestRate / 100.0;
		System.out.println("Decimal Interest: " + decimalInterest);
		double totalInterest = minimumBalance * decimalInterest * timePeriod;
		System.out.println("Total amount of interest: " + totalInterest);
	}

}

public class Inheritance1 {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount();
		sa.deposit("ICICI123456789", 1000);
		sa.withdrawal("ICICI123456789", 500);
		sa.interestCal(3, 1);
	}

}
