package fileConcept;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class FileZipper {

	public static void zipFile(String inputFile, String outputFile) throws IOException {
		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile);
				GZIPOutputStream gzipOS = new GZIPOutputStream(fos)) {

			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = fis.read(buffer)) != -1) {
				gzipOS.write(buffer, 0, bytesRead);
			}
		}
	}

	public static void main(String[] args) {
		String inputFile = "C:\\Users\\KumarGuA\\sample.txt";
		String outputFile = "C:\\Users\\KumarGuA\\sample.gz";

		try {
			zipFile(inputFile, outputFile);
			System.out.println("File zipped successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
