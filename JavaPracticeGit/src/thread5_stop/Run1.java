package thread5_stop;

import java.util.logging.Logger;

/**
 * 
 * @描述: interrupted() 测试当前线程是否是中断状态，执行后具有将状态标志置为false的功能
 *        isInterrupted() 测试当前线程对象是否是中断状态，但不具有清除功能 
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年10月9日 上午10:07:02
 */
public class Run1 {

	static Logger l = Logger.getLogger(Run1.class.getName());

	public static void main(String[] args) {
		try {
			MyThread thread = new MyThread();
			thread.start();
			thread.sleep(1000);
			thread.interrupt();
//			Thread.currentThread().interrupt();
			l.info("Thread.currentThread = " + Thread.currentThread().getName());
			System.out.println("是否停止1？ = " + thread.interrupted() + ", name=" + thread.getName());  //false
			System.out.println("是否停止2？ = " + thread.interrupted() + ", name=" + thread.getName());  // false
		} catch (InterruptedException e) {
			l.info("main exception");
		}
		l.info("end!");
	}

}
