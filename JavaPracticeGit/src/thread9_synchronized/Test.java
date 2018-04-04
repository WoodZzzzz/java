package thread9_synchronized;

public class Test {

	public static void main(String[] args) {
		Task task = new Task();
		MyThreadA t1 = new MyThreadA(task);
		t1.start();
		MyThreadB t2 = new MyThreadB(task);
		t2.start();
		
		/**
		 * 开始task任务
开始task任务
Thread-0进来了
线程Thread-0中途花费3秒时间处理
线程Thread-1中途花费3秒时间处理
任务处理结束，返回得到相应的值
Thread-1进来了
线程Thread-1中途花费3秒时间处理
线程Thread-1中途花费3秒时间处理
任务处理结束，返回得到相应的值
		 */
		//为什么结果会像上图那样，Thread-1执行了三次，原因是有可能在打印这句话的时候，第二个线程已经执行完了17行，这个时候后面就一直打印的是Thread-1
	}
}
