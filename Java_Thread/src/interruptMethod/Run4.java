package interruptMethod;

import org.apache.log4j.Logger;
/**
 * 
 * @描述: 线程for循环中断法
 * @版权: Copyright (c) 2017 
 * @公司: zwj 
 * @作者: zwj
 * @创建日期: 2017年7月8日 下午3:36:05
 */
public class Run4 {
	
	private static Logger logger = Logger.getLogger(Run4.class);

	public static void main(String[] args) {
		try {
			MyThread4 my = new MyThread4();
			my.start();
			Thread.sleep(2000);
			my.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		logger.info("end!");
	}

}
