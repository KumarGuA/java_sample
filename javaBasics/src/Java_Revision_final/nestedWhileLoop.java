package Java_Revision_final;

public class nestedWhileLoop {
	

	public static void main(String[] args) {
		
		
		int i = 1;
		while (i <= 5) {
		   
			for (int j = 1; j <= i; j++) {
		        System.out.print(j + " ");		  
			}
			
		    System.out.println();
		    i++;
		}
	}
}
