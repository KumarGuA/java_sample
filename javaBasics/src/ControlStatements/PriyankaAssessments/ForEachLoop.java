package ControlStatements.PriyankaAssessments;

public class ForEachLoop {

	public static void main(String[] args) {
		  
		   
		   int[] numbers = {3, 4, 5, 6};
		   int sum = 0;

		   char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		   for (int i = 0; i < vowels.length; ++ i) {
			     System.out.println(vowels[i]);
		   
		   }
		   for (int number: numbers) {
			     sum += number;}
		  
		   System.out.println("Sum = " + sum);
		 }
		}

