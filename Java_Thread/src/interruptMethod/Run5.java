package interruptMethod;

import org.apache.log4j.Logger;

/**
 * 
 * @描述: 如果当前线程在睡眠中被中断，则抛出中断异常 
 * @exception  InterruptedException if any thread has interrupted
 *             the current thread.  The <i>interrupted status</i> of the
 *             current thread is cleared when this exception is thrown.
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年7月8日 下午4:09:01
 */
public class Run5 {
	
	private static Logger logger = Logger.getLogger(Run5.class);

	public static void main(String[] args) {
		try {
			MyThread5 my = new MyThread5();
			my.start();
			Thread.sleep(2000);
			my.interrupt();
		} catch (InterruptedException e) {
			logger.info("main catch");
			e.printStackTrace();
		}
		logger.info("end!");
	}

}
