package SavitaAssessments;

public class Calfuninswitch {
	public static void main(String args[]) 
	{
		int a= 10;
		int b= 30;
		int add= a+b;
		int multi= a*b;
		int div= a/b;
		
		switch(multi) {
		
		case 1:
         System.out.println("Addition of two Numbers: " + add);
         break;
     case 2:
         System.out.println("multiplication of two Numbers: " + multi);
         break;
     case 3:
         System.out.println("division of two Numbers: " + div);
         break;
     default:
         System.out.println("Addition of two Numbers: " + add);
		}
	}
}