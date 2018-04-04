package thread5_stop;

/**
 * 
 * @描述: interrupt无法直接停止线程
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年9月19日 上午9:12:43
 */
public class Test1 {
	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
