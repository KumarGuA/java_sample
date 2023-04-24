package PujithaAssessments;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 18, i=2, flag=0;
		
		if(num <= 1)
			System.out.println(num+" is not a prime number. Prime number starts from 2");
		else
		{
			while(i < num)
			{
				if(num%i==0)
					flag += 1;
				i++;
			}
			if(flag == 0)
				System.out.println("Prime Number");
			else
				System.out.println("Not a Prime Number");
		}	
	}
}


