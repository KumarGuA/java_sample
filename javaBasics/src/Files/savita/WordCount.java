package Files.savita;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCount {

	public static void main(String[] args) throws Exception {
		String word;
		int count = 0;

		FileReader file = new FileReader("C:\\Selenium\\Java.txt");
		BufferedReader br = new BufferedReader(file);

		while ((word = br.readLine()) != null) {
			String words[] = word.split("");
			count = count + words.length;
		}

		System.out.println("Number of words present in given file: " + count);
		br.close();

	}

}
