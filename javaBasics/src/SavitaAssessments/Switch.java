package SavitaAssessments;

public class Switch {
	  public static void main(String[] args)
	    {
		  int URL = 0;
		  String TestURL="http://test.com";

		  String DevURL="http://Dev.com";

		  String UatURL="http://uat.com";

		  String environment= "test";
	        
	 
	        switch (URL) {
	 
	       
	        case 1:
	        	TestURL = "http://test.com";
	            break;
	 
	       
	        case 2:
	        	DevURL = "http://Dev.com";
	            break;
	 
	            
	        case 3:
	        	UatURL = "http://uat.com";
	            break;
	 
	           
	        case 4:
	        	environment = "test";
	            break;
	 
	        
	     default:
	    	 DevURL = "http://Dev.com";
	        }
	        System.out.println(DevURL);
	    }
	}


