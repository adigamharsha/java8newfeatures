package comharsha.javaadmirer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BeforeAfterVowelString {

	private static String printvowelSequenceWord(String s) {
		List<Integer> set = new ArrayList<Integer>();
		if (s == null && s.isEmpty())
			return null;
		char[] charArray = s.toCharArray();
		for (int j = 0; j <= charArray.length - 1; j++) {
			char t = charArray[j];
			char t2 = '0';
			if (j + 2 <= charArray.length - 1) {
				t2 = charArray[j + 2];
			}
			if ((t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u')
					&& (t2 == 'a' || t2 == 'e' || t2 == 'i' || t2 == 'o' || t2 == 'u')) {
				set.add(1);
			} else
				set.add(Integer.valueOf(t));
		}
		System.out.println(set);
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) == 1) {
				return s;
			}
		}
		return null;
	}

	public static void main(String args[]) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s = b.readLine().trim();
		String filteredString = " ";
		String[] split = s.split(" ");
		for (String str : split) {
			filteredString = printvowelSequenceWord(str);
			System.out.println(filteredString);
		}
	}
}