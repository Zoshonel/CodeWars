package kata.vowel2Index;

import java.util.Arrays;
import java.util.List;

public class Vowel2Index {
	public static String vowel2Index(String s){
		StringBuilder stringBuilder = new StringBuilder(s);
		List<Character> vowel = Arrays.asList('a','e','i','o','u');
		for (int i = stringBuilder.length()-1; i >=0; i--) {
			if (vowel.contains(Character.toLowerCase(stringBuilder.charAt(i)))) {
				stringBuilder.replace(i,i+1, Integer.toString(i+1));
			}
		}
		return stringBuilder.toString();
	}
}
