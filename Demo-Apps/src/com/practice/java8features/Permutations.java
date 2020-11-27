package comharsha.javaadmirer;

public class Permutations {

	public static void main(String[] args) {
		String s = "abc";		
		permut( s , 0 , s.length()-1);
	}

	private static void permut(String string, int m, int n) {
		if(m == n) {
			System.out.println(string);
			return ;
		}else{
			for(int i =m ; i<=n; i++) {
				string = swap(string , i ,m);
				permut(string , m+1 , n);
				string = swap(string , i ,m);
			}
		}
	}

	private static String swap(String string, int i, int m) {
		char[] ch = string.toCharArray();
		char temp = ch[i];
		ch[i] = ch[m];
		ch[m] = temp;
		return String.valueOf(ch);		
	}
}
