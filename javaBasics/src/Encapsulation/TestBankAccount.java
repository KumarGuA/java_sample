package Encapsulation;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		BankAccount account =new BankAccount("1234567890" , 1000.0);
		System.out.println("Account  balance : " + account.getBalance());
		
		account.deposite(500);
		System.out.println("Account balance : "+account.getBalance());
		
		account.withdraw(200.0);
		System.out.println("Account balance : "+account.getBalance());
		
		account.setBalance(1500.0);
		System.out.println("Account balance : "+account.getBalance());
	}

}
