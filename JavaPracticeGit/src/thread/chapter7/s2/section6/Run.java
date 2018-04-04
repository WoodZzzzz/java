package thread.chapter7.s2.section6;

/**
 * 
 * @描述: 线程组里增加多个线程，运行无限循环的线程，通过中断线程组来中断线程
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年10月20日 下午9:25:56
 */
public class Run {
	public static void main(String[] args) {
		try {
			ThreadGroup group = new ThreadGroup("我的线程组");
			for (int i = 0; i < 5; i++) {
				MyThread thread = new MyThread(group, "线程" + (i + 1));
				thread.start();
			}
			Thread.sleep(5000);
			group.interrupt();
			System.out.println("调用了interrupt()方法");
		} catch (InterruptedException e) {
			System.out.println("停止了");
			e.printStackTrace();
		}
	}
}
