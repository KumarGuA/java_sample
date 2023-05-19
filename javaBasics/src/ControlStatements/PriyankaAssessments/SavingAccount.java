package ControlStatements.PriyankaAssessments;

 interface Bank {
	default void deposit() {
		
		int dep= 2000;
		int Bal= 50000;
		System.out.println("Deposite amount is : "+dep);
		System.out.println("Balance amount is : "+ (dep+Bal));
	}
default void withdraw() {
		
		int withdrawAmt= 5000;
	
		System.out.println("withdraw amount is : "+withdrawAmt);
		
	}
default void getBalance() {
	
	int Balance= 52000;
	int withdrawAmt= 5000;
	int CurrentBalance= Balance-withdrawAmt;
	

	System.out.println("Current  balance is : "+CurrentBalance);
	
}
	
 }
 
 public class SavingAccount implements Bank {

		public static void main(String[] args) {

			SavingAccount AccDetails=new SavingAccount();
			
			AccDetails.deposit();
			AccDetails.withdraw();
			AccDetails.getBalance();
			

		}

	}
	