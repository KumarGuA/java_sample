package ControlStatements.PriyankaAssessments;

public class PrintUrlBySwitch {
	public static void main(String[] args) {
		String TestURL="http://test.com";
		String DevURL="http://Dev.com";
		String UatURL="http://uat.com";
		
		String environment= DevURL;
		
	switch(environment){
		
	case "http://test.com" : {
		System.out.println("This is a test url :- " +TestURL);
		break;
		
	}
	case "http://Dev.com" : {
		System.out.println("This is a Dev url :- " +DevURL);
		break;
	}
	case "http://uat.com" : {
		System.out.println("This is a Stage url :- " +UatURL);
		break;
	}
	default : {
		System.out.println("This is a don't know which url :- " +environment);
		break;
	}
	
	
	}
			
		

	}
}
