package comharsha.javaadmirer;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hanshaldeep";
		Map<Character , Integer> m = new HashMap<Character , Integer>();
		String s = " ";
		
		for(int i =0 ; i<str.length() ; i++) {
			if(m.containsKey(str.charAt(i))) {
				s+=str.charAt(i);
			}else m.put(str.charAt(i), 1);
		}
		System.out.println(s);

	}

}
