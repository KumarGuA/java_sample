package fileConcept;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Search_File_Priyanka {

	public static void main(String[] argv) throws Exception {
System.out.println("Enter the directory path: ");
Scanner sc = new Scanner(System.in);
String pathStr = sc.next();        
System.out.println("Enter the desired file name: ");
String file = sc.next();
System.out.println(file);      
File dir = new File(pathStr);
String[] list = dir.list();
System.out.println(Arrays.toString(list));
boolean flag = false;      
for (int i = 0; i < list.length; i++) {
 if(file.equals(list[i])){
	 flag = true;
 }}       
	if(flag){
System.out.println("File Found");
	}
	else{
	 System.out.println("File Not Found");
	      }

	}

}