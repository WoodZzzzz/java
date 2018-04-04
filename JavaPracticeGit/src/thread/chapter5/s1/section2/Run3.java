package thread.chapter5.s1.section2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run3 {

	private static Timer timer = new Timer();
	
	public static class MyTaskA extends TimerTask {
		
		public void run() {
			System.out.println("A 运行了，时间为:" + new Date());
			timer.cancel();
		}
	}
	
	public static class MyTaskB extends TimerTask {
		
		public void run() {
			System.out.println("B 运行了，时间为:" + new Date());
		} 
	}
	
	public static void main(String[] args) {
		try {
			MyTaskA ta = new MyTaskA();
			MyTaskB tb = new MyTaskB();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateStr = "2017-10-18 09:33:00";
			Date date = sdf.parse(dateStr);
			timer.schedule(ta, date, 4000);
			timer.schedule(tb, date, 4000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
