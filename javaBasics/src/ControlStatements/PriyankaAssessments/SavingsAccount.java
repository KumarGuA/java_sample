package ControlStatements.PriyankaAssessments;

public class SavingsAccount extends BankAccount {
	
	int intrate;{
		//Interest = Principal x Rate x Time
	intrate=(Balance*100)/7;
	
	}
	
	  public void interest_rate() {
		  System.out.println("The rate of interest is:"+intrate);
		
	}
	  int MinBal;{
	  MinBal=1000;
	  }
	  public void minimum_balance() {
		  
		  System.out.println("Minimun balance is:"+MinBal);
			
		  
		
	}
}
    
