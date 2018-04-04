package thread.chapter5.s1.section2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run4 {

	static int i = 0;
	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("正常执行了" + i);
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			try {
				i++;
				Timer timer = new Timer();
				MyTask task = new MyTask();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateStr = "2017-10-18 21:41:45";
				Date date = sdf.parse(dateStr);
				timer.schedule(task, date);
				timer.cancel();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
	}
}
