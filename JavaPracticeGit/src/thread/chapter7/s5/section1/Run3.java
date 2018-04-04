package thread.chapter7.s5.section1;

import java.lang.Thread.UncaughtExceptionHandler;

public class Run3 {

	public static void main(String[] args) {
		MyThread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("�̣߳�" + t.getName() + "�������쳣");
				e.printStackTrace();
			}
		});
		MyThread t1 = new MyThread();
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.start();
	
	}
}
