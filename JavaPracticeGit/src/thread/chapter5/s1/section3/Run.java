package thread.chapter5.s1.section3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run {

	public static class MyTask extends TimerTask {
		@Override
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ:" + new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static class MyTaskB extends TimerTask {
		@Override
		public void run() {
			System.out.println("begin ������B��" + new Date());
			try {
				Thread.sleep(1000);
				System.out.println("end ������B��" + new Date());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
	/*	MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("��ǰʱ�䣺" + new Date().toLocaleString());
		timer.schedule(task, 2000, 2000);  //���task����û����ʱ�������һ������Ŀ�ʼʱ������
*/		
		MyTaskB tb = new MyTaskB();
		Timer t2 = new Timer();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = "2017-10-19 10:21:25";
		try {
			Date date = sdf.parse(dateStr);
			System.out.println("��ǰʱ�䣺" + new Date().toLocaleString());
			t2.scheduleAtFixedRate(tb, date, 2000);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
