package kata.backronym;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Backronym {
	private static Map<String, String> dictionary = Preload.dictionary;
	public static String makeBackronym(String acronym) {
		List<String> result = new ArrayList<String>();
		for (char character : acronym.toUpperCase().toCharArray()) {
			String word = dictionary.get(String.valueOf(character));
			result.add(word);
		}
		return String.join(" ", result);
	}
}
