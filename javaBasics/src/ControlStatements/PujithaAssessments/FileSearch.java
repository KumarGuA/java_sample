package ControlStatements.PujithaAssessments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileSearch {

	public void dataSearch(String text) throws IOException {
		int i=1;
		boolean foudText = false;
		String[] allFiles;
		File maindir = new File("C:\\Users\\DiviPuji\\Downloads\\Food");
		System.out.println("parent Directory: "+maindir.getName());
		String[] alldirs = maindir.list();
		for(String eachdir: alldirs) {
			File dir = new File(maindir, eachdir);
			if(dir.isDirectory()) {
				System.out.println(" Sub Directory "+i+": "+eachdir);
				allFiles = dir.list();
				for(String eachFile: allFiles) {
					File file = new File(dir.getAbsolutePath(), eachFile);
					System.out.println("  Sub File "+i+": "+eachFile);
					BufferedReader reader = new BufferedReader(new FileReader(file));
					String line;
					while((line = reader.readLine())!=null) {
						if(line.contains(text)) {
							foudText = true;
							System.out.println();
							System.out.println("The given text is present in below file/files: "+file.getName());
							System.out.println();

						}
					}
				}
				System.out.println();
			}
			i++;
		}
		if(foudText == false) {
			System.out.println("Sorry, Given text is not present in any available file ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		FileSearch fs = new FileSearch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any text: ");
		String input = sc.next();
		fs.dataSearch(input);
	}

}
