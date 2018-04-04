package thread.chapter5.s1.section1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Run1 {

	private static Timer timer = new Timer();
	/*
	 *  ����Ϊ�ػ��̣߳���MyTaskִ����֮��ͽ�����
	 */
//	private static Timer timer = new Timer(true);
	public static class MyTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("�����ˣ�ʱ��Ϊ" + new Date());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static class MyTask2 extends TimerTask {
		
		@Override
		public void run() {
			System.out.println("������,ʱ��Ϊ" + new Date());
		}
	}

	public static void main(String[] args) {
		try {
			MyTask task = new MyTask();
			MyTask2 task2 = new MyTask2();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dateString = "2017-10-18 17:15:40";
			String dateString2 = "2017-10-18 17:15:41";
			Date date = sdf.parse(dateString);
			Date date2 = sdf.parse(dateString2);
			System.out.println("�ַ���ʱ��Ϊ :" + date.toLocaleString() + "��ǰʱ��"
					+ new Date().toLocaleString());
			System.out.println("�ַ���ʱ��Ϊ:" + date2.toLocaleString() + "��ǰʱ��"
					+ new Date().toLocaleString());
			timer.schedule(task, date);
			timer.schedule(task2, date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
