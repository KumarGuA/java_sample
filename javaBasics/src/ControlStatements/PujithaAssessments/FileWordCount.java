package ControlStatements.PujithaAssessments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWordCount {

	public void countwords(String file) throws IOException {
		File f = new File(file);
		BufferedReader br = new BufferedReader(new FileReader(f));
		int count=0;
		String line;
		try {
			while((line=br.readLine()) != null) {
				System.out.println(line);
				String ar[] = line.split(" ");
				System.out.println("lenght: "+ar.length);
				count += ar.length;
			}
			System.out.println("Total number of words: "+count);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null) {
				br.close();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		FileWordCount fwc = new FileWordCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter file name: ");
		String filePath = sc.nextLine();
		File f = new File(filePath);
		fwc.countwords(f.getAbsolutePath());
	}
}
