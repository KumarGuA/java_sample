package ControlStatements.PujithaAssessments;

import java.util.ArrayList;
import java.util.List;

//write a java program to count the number of vowels and consonants in a given string . (STRING, ARRAY)

class countVowelsConsonents {

	public void stringCount(String str) {
		int vc = 0;
		int cc = 0;
		List<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		int i=0;
		while(i< str.length()) {
			if(vowels.contains(str.charAt(i))) {
				vc+=1;
			}
			else {
				cc+=1;
			}
			i++;
		}
		System.out.println("Total number of vowels in a given string: " + vc);
		System.out.println("Total number of consonents in a given string: " + cc);
	}

}

public class Array2 {

	public static void main(String[] args) {
		countVowelsConsonents cvc = new countVowelsConsonents();
		cvc.stringCount("array");
	}

}
