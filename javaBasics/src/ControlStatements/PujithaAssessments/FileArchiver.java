
//Implement a simple file archiving program that allows the user to compress multiple files into a single archive file. 
//Prompt the user to enter the names of the files to include in the archive, and create a compressed archive file containing those files.
	
package ControlStatements.PujithaAssessments;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class CompressFiles{
	
	public void zipMultipleFiles(List<String> files) {
		FileOutputStream fos = null;
		ZipOutputStream zos=null;
		try {
			fos = new FileOutputStream("C:/Users/DiviPuji/Downloads/zips/completeZipFile.zip");
			zos = new ZipOutputStream(new BufferedOutputStream(fos));
			
			for(String file: files) {
				File f = new File(file);
				if(!f.exists()) {
					f.createNewFile();
				}
				
				ZipEntry ze = new ZipEntry(f.getName());
				System.out.println("Zipping "+f.getName()+" file");
				
				zos.putNextEntry(ze);	
				zos.flush();
			}
			zos.close();
			System.out.println("Zipping is done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fos != null)
					fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

public class FileArchiver {

	public static void main(String[] args) {
		CompressFiles cf = new CompressFiles();
		List<String> files = new ArrayList<>();
		files.add("C:/Users/DiviPuji/Downloads/zips/file1.txt");
		files.add("C:/Users/DiviPuji/Downloads/zips/file2.txt");
		files.add("C:/Users/DiviPuji/Downloads/zips/file3.txt");
		cf.zipMultipleFiles(files);
	}
}
