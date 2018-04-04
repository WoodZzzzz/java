package thread.chapter7.s4.section1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

	private SimpleDateFormat sdf;
	private String dateString;

	public MyThread(SimpleDateFormat sdf, String dateString) {
		this.sdf = sdf;
		this.dateString = dateString;
	}

	public void run() {
		try {
			Date date = sdf.parse(dateString);
			String newString = sdf.format(date);
			if (!dateString.equals(newString)) {
				System.out.println("ThreadName = "
						+ Thread.currentThread().getName() + "转换错误 日期字符串为"
						+ dateString + ",转换之后的日期为 " + newString);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
