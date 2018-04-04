package yield;

/**
 * 
 * @描述: yield 用于将线程让步，让给其他线程（也许会自己执行） 
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年7月17日 下午2:08:05
 */
public class MyThread extends Thread {

	public void run() {
		long beginTime = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 50000000; i++) {
			Thread.yield();
			count = count + (i + 1);
		}
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - beginTime) + "毫秒");
	}
}
