package kata.backronym;

import java.util.HashMap;
import java.util.Map;

public class Preload {
	public static Map<String, String> dictionary = new HashMap<>();
	public Preload() {
		dictionary.put("a", "awesome");
		dictionary.put("c", "confident");
		dictionary.put("d", "disturbing");
		dictionary.put("e", "eager");
		dictionary.put("g", "gregarious");
		dictionary.put("i", "ingestable");
		dictionary.put("n", "newtonian");
		dictionary.put("o", "oscillating");
		dictionary.put("r", "rant");
		dictionary.put("s", "stylish");
		dictionary.put("t", "turn");
		dictionary.put("w", "weird");
	}
}
