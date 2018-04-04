package runnable3_volatile;

/**
 * 
 * @描述: 如果采用-server模式，取的是私有内存的isRunning值，使用volatile强制让线程从主内存中获取最新的值
 *  如果不采用-server模式，取的主内存的isRunning只
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年9月22日 下午5:12:56
 */
public class Run {

	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("已经把被赋值为false了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
