package ControlStatements.BhoomikaAssesments;

class BankAccount {
	
	int balance=100;
	int account_number=5100;
	
	public void AccountDeails() {
		System.out.println("Account Balance is :"+balance);
		System.out.println("Account Number is : "+account_number);
	}
	public void deposit(int dep) {
		balance+=dep;
		System.out.println("Deposited amount is :"+dep);
		System.out.println("Account balance after deposite :"+balance);
	}
	public void withdraw(int withdraw) {
		System.out.println("Withdraw amount : "+withdraw);
		System.out.println("Balance after withdraw :"+(balance-withdraw));
		
	}
	
}
class SavingsAccount extends BankAccount {
	
	int interest =5;
	int minimum_balance;
	
	
	public void Savingaccount() {
		System.out.println(interest+" % interest");
	//	System.out.println("Minimum Balance is :"+minimum_balance);
	}
	
	public void Interest() {
		System.out.println("Interest amount is : "+(balance*5/100));
	}
	
}

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount obj = new SavingsAccount();
		obj.AccountDeails();
		obj.Savingaccount();
		obj.deposit(200);
		obj.Interest();
		obj.withdraw(100);
		
		
	}	
	}
	
