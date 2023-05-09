package ControlStatements.SavitaAssessments;

class BankAccount {

	int balance = 1000;
	int account_number = 12345678;

	public void AccountDeails() {
		System.out.println("Account Balance is :" + balance);
		System.out.println("Account Number is : " + account_number);
	}

	public void deposit(int dep) {
		balance += dep;
		System.out.println("Deposited amount is :" + dep);
		System.out.println("Account balance after deposite :" + balance);
	}

	public void withdraw(int withdraw) {
		System.out.println("Withdraw amount : " + withdraw);
		System.out.println("Balance after withdraw :" + (balance - withdraw));

	}

}

class SavingsAccount extends BankAccount {

	int interest = 8;
	int minimum_balance;

	public void Savingaccount() {
		System.out.println(interest + " % interest");

	}

	public void Interest() {
		System.out.println("Interest amount is : " + (balance * 8 / 1000));
	}

}

public class BankAccount1 {
	public static void main(String[] args) {

		SavingsAccount obj = new SavingsAccount();
		obj.AccountDeails();
		obj.Savingaccount();
		obj.deposit(800);
		obj.Interest();
		obj.withdraw(500);

	}
}
