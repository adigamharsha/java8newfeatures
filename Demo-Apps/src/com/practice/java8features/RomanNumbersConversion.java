package comharsha.javaadmirer;

public class RomanNumbersConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 404;
		
		String units[] = {"" , "I" , "II" , "III" , "IV" , "V" , "VI" , "VII" , "VIII" , "IX"};
		
		String tens[] = {"" , "X" , "XX" , "XXX" , "XL" , "L" , "LX" , "LXXX" , "LXXX" , "XC"};
		
		String hundreds[] = {"" , "C" , "CC" , "CCC" , "CD" , "D" , "DC" , "DCC" , "DCCC" , "CM"};
		
		String thousands[] = {"" , "M" , "MM" , "MMM" };
		
		String s = thousands[(num)/1000] + hundreds[(num%1000)/100]+ tens[(num%100)/10] + units[num%10];
		System.out.println(s);
	}

}
