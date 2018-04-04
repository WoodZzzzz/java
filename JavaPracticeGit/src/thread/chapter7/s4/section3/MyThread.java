package thread.chapter7.s4.section3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {

	private String dateStr;
	private String pattern;

	public MyThread(String dateStr, String pattern) {
		this.dateStr = dateStr;
		this.pattern = pattern;
	}

	public void run() {
		SimpleDateFormat sdf = null;
		Date date = null;
		try {
			sdf = DateTools.getSimpleDateFormat("yyyy-MM-dd");
			date = sdf.parse(dateStr);
			String newString = sdf.format(date);
			if (!dateStr.equals(newString)) {
				System.out.println("ThreadName = "
						+ Thread.currentThread().getName() + "ת������ԭ�����ַ���Ϊ��"
						+ dateStr + "��ת��֮����ַ���Ϊ��" + newString);
			} else {
				System.out.println("ThreadName = "
						+ Thread.currentThread().getName() + "ת����ȷ��ԭ�����ַ���Ϊ��"
						+ dateStr + "��ת��֮����ַ���Ϊ��" + newString);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
