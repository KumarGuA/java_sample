package fileConcept;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Copy_File_Priyanka {
	
public static void main(String arg[]) throws Exception {  
Scanner sc = new Scanner(System.in);  
 
System.out.print("Provide source file name :"); 
String sfile = sc.next(); 
 System.out.print("Provide destination file name :");
 String dfile = sc.next();
FileReader fr = new FileReader(sfile);  
FileWriter fw = new FileWriter(dfile, true);  
int copy;  
while ((copy = fr.read()) != -1) {  
  fw.write(copy);  
}  
System.out.println("Copy Finished");  
fr.close();  
fw.close();
	}


}
