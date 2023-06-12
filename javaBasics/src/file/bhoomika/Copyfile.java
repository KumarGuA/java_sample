package file.bhoomika;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Copyfile {

	public static void main(String arg[]) throws Exception {  
		  Scanner sc = new Scanner(System.in);  
		  System.out.print("Provide source file name :");  
		  // C:\\selenium\\java1.txt
		  String sfile = sc.next();  
		  System.out.print("Provide destination file name :"); 
		  // C:\\selenium\\java2.txt
		  String dfile = sc.next();  
		  FileReader fr = new FileReader(sfile);  
		  FileWriter fw = new FileWriter(dfile, true);  
		  int c;  
		  while ((c = fr.read()) != -1) {  
		   fw.write(c);  
		  }  
		  System.out.println("File copied");  
		  fr.close();  
		  fw.close();
	}

}
