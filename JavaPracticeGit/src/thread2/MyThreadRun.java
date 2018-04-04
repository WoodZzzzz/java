package thread2;

/**
 * 
 * @描述: 
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年9月18日 下午3:44:51
 */
public class MyThreadRun {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		try {
			for (int i = 0; i < 10; i++) {
				int time = (int) (Math.random() * 1000);
				Thread.sleep(time);
				System.out.println("main=" + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
