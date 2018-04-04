package interruptMethod;

import org.apache.log4j.Logger;

public class MyThread extends Thread{

	private static Logger logger = Logger.getLogger(MyThread.class);
	
	public void run(){
		super.run();
		for (int i = 0; i < 500000; i++){
			logger.info("i = " + (i + 1));
		}
	}
}
