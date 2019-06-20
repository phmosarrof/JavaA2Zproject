package arrayListCollections;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalDateSimpleFormat {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("MM-dd-yyyy hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(sf.format(d));
		System.out.println(cal.getTime());
		System.out.println(cal.DAY_OF_YEAR);
		System.out.println(cal.DAY_OF_WEEK_IN_MONTH);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));

		int a[] = { 20, 4, 7, 8, 100, 2, 3, 2 };

		for (int i = 0; i < a.length; i++) {
			// System.out.println(a[i]);
			// System.out.println(a[2]);
			if (a[i] == 2) {
				System.out.println(a[i]);
				break;
			}
		}
		// System.out.println(a[1]);
		// System.out.println(a[0]);
		// System.out.println(a[2]);
		// System.out.println(a);
	}

}
