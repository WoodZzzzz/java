package thread.chapter7.s2.section1;

public class Run {

	public static void main(String[] args) {
		ThreadA a = new ThreadA();  //Thread-0
		ThreadB b = new ThreadB();  //Thread-1
		ThreadGroup group = new ThreadGroup("线程组");
		Thread aThread = new Thread(group, a);  //Thread-2
		Thread bThread = new Thread(group, b);  //Thread-3
		aThread.start();
		bThread.start();
		System.out.println("活动的线程数为" + group.activeCount());
		System.out.println("线程组的名称为" + group.getName());
	}
}
