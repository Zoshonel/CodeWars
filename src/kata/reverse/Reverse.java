package kata.reverse;

public class Reverse {
	public String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return new StringBuilder(String.valueOf(str.charAt(str.length()-1)))
				.append(reverse(str.substring(0,str.length()-1))).toString();
	}
}
