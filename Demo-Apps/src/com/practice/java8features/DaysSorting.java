package comharsha.javaadmirer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaysSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Map<String, Integer> m = new HashMap<String, Integer>() {
			{
				put("Monday", 1);
				put("Tuesday", 2);
				put("Wednesday", 3);
				put("Thursday", 4);
				put("Friday", 5);
				put("Saturday", 6);
				put("Sunday", 7);
			}
		};

		List<String> l = new ArrayList<String>();
		List<String> final_weekList = new ArrayList<String>(10);
		l.add("Saturday");
		l.add("Thursday");
		l.add("Friday");
		l.add("Monday");
		l.add("Wednesday");
		l.add("Sunday");
		l.add("Tuesday");

		Collections.sort(l, new Comparator<String>() {
			public int compare(String s1, String s2) {
				try {
				SimpleDateFormat format = new SimpleDateFormat("EEE");
				Date d1 = format.parse(s1);
				Date d2 = format.parse(s2);
				if (d1.equals(d2)) {
					return s1.substring(s1.indexOf(" ") + 1).compareTo(s2.substring(s2.indexOf(" ") + 1));
				} else {
					Calendar cal1 = Calendar.getInstance();
					Calendar cal2 = Calendar.getInstance();
					cal1.setTime(d1);
					cal2.setTime(d2);
					return cal1.get(Calendar.DAY_OF_WEEK) - cal2.get(Calendar.DAY_OF_WEEK);
				}
				}catch(ParseException e) {
					e.printStackTrace();
				}
				return -1;
			}	

		});
		
		System.out.println(l);

	}

}
