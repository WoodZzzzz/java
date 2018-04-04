package interruptMethod;

import org.apache.log4j.Logger;
/**
 * 
 * @描述: isInterrupted 查询当前线程是否中断，不会清除状态标志
 * @版权: Copyright (c) 2017 
 * @公司: zwj 
 * @作者: zwj
 * @创建日期: 2017年7月8日 下午3:36:05
 */
public class Run3 {
	
	private static Logger logger = Logger.getLogger(Run3.class);

	public static void main(String[] args) {
		try {
			MyThread my = new MyThread();
			my.start();
			Thread.sleep(2000);
			my.interrupt();
			logger.info("是否停止1" + my.isInterrupted());
			logger.info("是否停止2" + my.isInterrupted());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("end!");
	}

}
