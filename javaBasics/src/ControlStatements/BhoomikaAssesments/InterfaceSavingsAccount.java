package ControlStatements.BhoomikaAssesments;

interface Bank{
	int dep=5000;
	int withdraw = 2000;
	int bal = (dep-withdraw);
	void deposit(); 
	void withdraw();
	void getBalance();
}
public class InterfaceSavingsAccount implements Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceSavingsAccount obj =new InterfaceSavingsAccount();
		obj.deposit();
		obj.withdraw();
		obj.getBalance();
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposited amount : "+dep);
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdraw amount : "+withdraw);
		
	}

	@Override
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Balance after withdraw : "+bal);
		
	}

}
