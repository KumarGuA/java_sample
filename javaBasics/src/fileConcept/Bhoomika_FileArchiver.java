package fileConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Bhoomika_FileArchiver {

	public static void main(String[] args) throws IOException {
		String f1 = "C:\\selenium\\java1.txt";
		String f2 = "C:\\selenium\\java2.txt";
		final List<String> srcfile = Arrays.asList(f1, f2);
		final FileOutputStream fos = new FileOutputStream(
				Paths.get(f1).getParent().toAbsolutePath() + "/compressFile.zip");
		ZipOutputStream zipOut = new ZipOutputStream(fos);
		for (String srcFile : srcfile) {
			File fileToZip = new File(srcFile);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			zipOut.putNextEntry(zipEntry);
			byte[] bytes = new byte[1024];
			int length;
			while ((length = fis.read(bytes)) >= 0) {
				zipOut.write(bytes, 0, length);
			}
			fis.close();
		}
		zipOut.close();
		fos.close();
	}

}
