package interruptMethod;

import org.apache.log4j.Logger;

/**
 * 
 * @描述: 线程for循环中断
 * @版权: Copyright (c) 2017
 * @作者: zwj
 * @创建日期: 2017年7月8日 下午3:49:07
 */
public class MyThread4 extends Thread {

	private static Logger logger = Logger.getLogger(MyThread4.class);

	public void run() {
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				logger.info("已经是停止状态了，退出");
				break;
			}
			logger.info("i = " + (i + 1));
		}
		logger.info("线程方法其实并未终止");
	}

	/**
	 *  停止线程--异常法
	 */
	/*public void run() {
		super.run();
		try {
			for (int i = 0; i < 50000; i++) {
				if (this.interrupted()) {
					logger.info("已经是停止状态了");
					throw new InterruptedException();
				}
				System.out.println("i = " + (i + 1));
			}
			logger.info("for下面的语句不会输出");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}*/
}
