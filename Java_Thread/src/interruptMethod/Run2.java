package interruptMethod;

import org.apache.log4j.Logger;

/**
 * 
 * @描述: interrupted 查询当前线程是否中断，执行之后将当前状态标志置为false
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年7月8日 下午3:38:45
 */
public class Run2 {
	
	private static Logger logger = Logger.getLogger(Run2.class);
	
	public static void main(String[] args) {
		try {
			MyThread my = new MyThread();
			my.start();
			Thread.sleep(2000);
			my.interrupt();
			logger.info("是否停止1 ? =" + my.interrupted());
			logger.info("是否停止2 ? =" + my.interrupted());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("end!");
	}

}
