package thread.chapter7.s2.section3;

public class Run {

	public static void main(String[] args) {
		System.out.println("线程：" + Thread.currentThread().getName()
				+ "所属的线程组名为"
				+ Thread.currentThread().getThreadGroup().getName()
				+ " 中有线程组数量"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());

		ThreadGroup group = new ThreadGroup("new Group");
		System.out.println("线程：" + Thread.currentThread().getName()
				+ "所属的线程组名为"
				+ Thread.currentThread().getThreadGroup().getName()
				+ " 中线程组数量:"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread()
				.getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("第一个线程组名称为:" + threadGroup[i].getName());
		}
	}
}
