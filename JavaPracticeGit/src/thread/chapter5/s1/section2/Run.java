package thread.chapter5.s1.section2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

	public static class MyTask extends TimerTask {

		public void run() {
			System.out.println("运行了,时间为:" + new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			this.cancel();  //将自身任务从队列中清除
		}
	}

	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2014-10-12 10:12:00";
			Timer timer = new Timer();
			Date date = sdf.parse(dateString);
			timer.schedule(task, date, 2000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
