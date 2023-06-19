package Java_Revision_final;

public class SubstringMatchExample {
	
	public static String findSubstringInSentence(String sentence, String substring) {
		if (sentence.contains(substring)) {
			return sentence;
		} else {
			return "Not found";
		}
	}

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
		String substring1 = "fox";
		String substring2 = "cat";

		String result1 = findSubstringInSentence(sentence, substring1);
		System.out.println(result1);

		String result2 = findSubstringInSentence(sentence, substring2);
		System.out.println(result2);

	}
}
