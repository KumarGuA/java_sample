package ControlStatements.PriyankaAssessments;

public class InterestCalculation extends SavingsAccount {

	int Dep;
	{
		Dep = 50000;
	}

	public void Deposit() {
		System.out.println("The deposite amount is:" + Dep);
	}

	int withdraw;
	{
		withdraw = 1000;
	}

	public void withdrawal() {

		System.out.println("The withdrawal amount is:" + withdraw);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount SA = new SavingsAccount();
		SA.account_number();
		SA.balance();
		SA.interest_rate();
		SA.minimum_balance();

		InterestCalculation Cal = new InterestCalculation();
		Cal.Deposit();
		Cal.withdrawal();
	}

}
