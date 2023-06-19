package ControlStatements.PujithaAssessments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
	
	public void contentTransfer(String string, String string2) throws IOException {
		
		FileInputStream fis = new FileInputStream(string);
		FileOutputStream fos = new FileOutputStream(string2);
		
		try {
			int i;
			while((i=fis.read())!=-1) {
				fos.write(i);
			}
			System.out.println("Data transferred successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(fis!=null) {
				fis.close();
			}
			if(fos!=null) {
				fos.close();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		FileCopy fc = new FileCopy();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name to copy: ");
		String file1 = sc.nextLine();
		File f1 = new File(file1);
		System.out.println("Enter file name to paste: ");
		String file2 = sc.nextLine();
		File f2 = new File(file2);
		fc.contentTransfer(f1.getCanonicalPath(), f2.getAbsolutePath());
	}

}
