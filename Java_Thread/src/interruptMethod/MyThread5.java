package interruptMethod;

import org.apache.log4j.Logger;

/**
 * 
 * @描述: 如果当前线程在睡眠中被中断，则抛出中断异常 
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年7月8日 下午4:07:20
 */
public class MyThread5 extends Thread {

	private static Logger logger = Logger.getLogger(MyThread5.class);

	public void run() {
		super.run();
		try {
			logger.info("run begin!");
			Thread.sleep(20000);
			logger.info("run end!");
		} catch (InterruptedException e) {
			logger.info("在睡眠中被停止!进入catch  --" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
