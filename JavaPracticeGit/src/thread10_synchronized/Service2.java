package thread10_synchronized;

public class Service2 {

	public void serviceMethod(MyOneList2 list, String data) {
		try {
			synchronized (list) {  //去掉这里，就会出现线程不安全，保留这里，使list的if代码块走完再释放list对象锁
				if (list.getSize() < 1) {
					/*
					 * 这里让先进入的线程A休眠，这样可以让后进入的线程B也进入这个判断，因为线程A已经释放了list的锁，
					 * 线程B刚好可以进入getSize
					 * ，这时由于size还是0，所以两个线程都进入了这个判断，这样两个线程都可以添加元素。
					 */
					Thread.sleep(2000);
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
