package thread.chapter7.s4.section3;

import java.text.SimpleDateFormat;

public class DateTools {

	private static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<SimpleDateFormat>();
	
	public static SimpleDateFormat getSimpleDateFormat(String pattern) {
		SimpleDateFormat sdf = t1.get();
		if (sdf == null) {
			sdf = new SimpleDateFormat(pattern);
			t1.set(sdf);
		}
		return sdf;
	}
}
