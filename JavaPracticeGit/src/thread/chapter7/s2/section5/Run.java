package thread.chapter7.s2.section5;

public class Run {

	public static void main(String[] args) {
		System.out.println("�߳�������:"
				+ Thread.currentThread().getThreadGroup().getName());
		System.out.println("�߳����л���߳�������"
				+ Thread.currentThread().getThreadGroup().activeCount());
		System.out.println("�߳������߳��������-��֮ǰ:"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup newGroup = new ThreadGroup(Thread.currentThread()
				.getThreadGroup(), "newGroup");
		System.out.println("�߳������߳��������-��֮��:"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		System.out
				.println("���߳������ƣ�"
						+ Thread.currentThread().getThreadGroup().getParent()
								.getName());
	}
}
