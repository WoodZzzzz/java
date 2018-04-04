package thread9_synchronized;

public class Task {

	private String data1;
	private String data2;
	public void doTask() {
		try {
			System.out.println("开始task任务");
			Thread.sleep(3000);
			String privateData1 = "线程" + Thread.currentThread().getName()
					+ "中途花费3秒时间处理";
			String privateData2 = "线程" + Thread.currentThread().getName()
					+ "中途花费3秒时间处理";
			synchronized (this) {
				data1 = privateData1;
				data2 = privateData2;
				System.out.println(Thread.currentThread().getName() + "进来了");
			}
			System.out.println(data1);  
			System.out.println(data2);//有可能在打印这句话的时候，第二个线程已经执行完了17行，这个时候后面就一直打印的是Thread-1
			System.out.println("任务处理结束，返回得到相应的值");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
