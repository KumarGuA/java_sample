package ControlStatements;

public class ControlStatementsExample {

	public static void main(String[] args) {

		// comments
		// 1- if statements (conditional statements)

//		int num1=30;
//		int num2=20;
//		
//		int res=0;
//		
//		res=(num1>num2)?(num1+num2):(num1-num2);
		//System.out.println(res);
		
//		  int time=22; 
//		  if(time < 45) { 			  
//			  if(time >23)
//			  {
//			  System.out.println("GOOD MORNING"); 
//			  }
//	    } else if(time<18) {
//			  
//			  System.out.println("GOOD DAY"); 
//			  } else {
//		  
//				  System.out.println("GOOD AFTERNOON");
//		  }
		 
		// 2- switch statements
            //		int day = 10;
           //		switch (day) {
           //		case 1:
           //			System.out.println("MONDAY");
           //			break;
           //		case 2:
//			System.out.println("TUESDAY");
//			break;
//		case 3:
//			System.out.println("wed");
//			break;
//		case 4:
//			System.out.println("fri");
//			break;
//		default:
//			System.out.println("sat");
// 3- while loop
//		int i=0;
//		while(i<5)
//		{
//			System.out.println(i);
//			i++;
//		}
// 4- do while loop
// 5- for loop
//		for(int i=0 ;i <=10 ; i++)
//		{
//			System.out.println(i);
//		}
// 6- break statement
//		for( int i=0;i<=10;i++)
//		{
//			if(i==4)
//			{
//				break;
//			}
//			System.out.println(i);	
//		}
	
// 7- continue statements
//		for(int i=0;i<10;i++)
//		{
//			if(i==4)
//			{
//				continue;
//			}
//			System.out.println(i);
//		}
		//Nested for loop
		//outer loop
		for (int i = 1; i <= 2; i++) {
			System.out.println("outer " + i);  // excutes 2 times

			// inner loop
			for (int j = 1; j <= 3; j++) {
				System.out.println("inner " + j); // Excutes 6 times (2*3) 
			}
		}
		
		
	}
}

