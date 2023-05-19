package ControlStatements.SavitaAssessments;

interface AccountBank {

	default void deposit(int dep) {
		int balance = 25000;
		int deposit1 = 5000;
		System.out.println("Deposited amount is :" + dep);
		System.out.println("Balance amount is :" + (balance + deposit1));

	}

	default void withdraw(int withdraw) {

		int withdraw1 = 2500;

		System.out.println("Withdraw amount :" + withdraw1);

	}

	default void getBalance(int balance) {

		int balance1 = 30000;

		System.out.println("get balance :" + balance1);

	}
}

public class SavingsAccountDetails implements AccountBank {

	public static void main(String[] args) {

		SavingsAccountDetails AccDet = new SavingsAccountDetails();
		AccDet.deposit(5000);
		AccDet.getBalance(30000);
		AccDet.withdraw(2500);

	}

}
