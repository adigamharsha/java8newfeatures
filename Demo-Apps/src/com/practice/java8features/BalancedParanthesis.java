package comharsha.javaadmirer;

import java.util.HashMap;
import java.util.Map;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{[({})]}";
		Map<Character, Integer> m = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			checkParanthesis(m, c);
		}
		if ((m.get('(')).equals(m.get(')')) && (m.get('[')).equals(m.get(']')) && (m.get('{')).equals(m.get('}'))) {
			System.out.println("Balanced paranthesis");
		} else
			System.out.println("Unbalanced Paranthesis");
	}

	private static void checkParanthesis(Map<Character, Integer> m, char c) {
		if (!m.containsKey(c)) {
			m.put(c, 1);
		} else {
			Integer count = m.get(c);
			m.put(c, ++count);
		}
	}
}
