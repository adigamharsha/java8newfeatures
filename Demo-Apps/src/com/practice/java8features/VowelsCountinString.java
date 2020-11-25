package comharsha.javaadmirer;

import java.util.HashMap;
import java.util.Map;

public class VowelsCountinString {

	private static Map<Character, Integer> vowelCount(String s, Map<Character, Integer> m) {
		for (char c : s.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				if (!m.containsKey(c))
					m.put(c, 1);
				else {
					Integer count = m.get(c);
					m.put(c, ++count);
				}
			}
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a Data Driven industry";
		System.out.println(str.replaceAll("\\s", ""));
		String lowerCaseString = str.toLowerCase();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		Map<Character, Integer> map = vowelCount(lowerCaseString, m);
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" ::"+entry.getValue());
		}

	}

}
