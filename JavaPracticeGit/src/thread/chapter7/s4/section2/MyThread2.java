package thread.chapter7.s4.section2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread2 extends Thread {

	private String dateString;
	private String pattern;

	public MyThread2(String dateString, String pattern) {
		this.dateString = dateString;
		this.pattern = pattern;
	}

	public void run() {
		try {
			Date date = DateTools.parse(pattern, dateString);
			String newString = DateTools.format(pattern, date);
			if (!dateString.equals(newString)) {
				System.out.println("ThreadName = "
						+ Thread.currentThread().getName() + "转换错误 日期字符串为"
						+ dateString + ",转换之后的日期为 " + newString);
			} else {
				System.out.println("ThreadName = "
						+ Thread.currentThread().getName() + "转换正确 日期字符串为"
						+ dateString + ",转换之后的日期为 " + newString);
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
