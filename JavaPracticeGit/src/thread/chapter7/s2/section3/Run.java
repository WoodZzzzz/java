package thread.chapter7.s2.section3;

public class Run {

	public static void main(String[] args) {
		System.out.println("�̣߳�" + Thread.currentThread().getName()
				+ "�������߳�����Ϊ"
				+ Thread.currentThread().getThreadGroup().getName()
				+ " �����߳�������"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());

		ThreadGroup group = new ThreadGroup("new Group");
		System.out.println("�̣߳�" + Thread.currentThread().getName()
				+ "�������߳�����Ϊ"
				+ Thread.currentThread().getThreadGroup().getName()
				+ " ���߳�������:"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread()
				.getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
		for (int i = 0; i < threadGroup.length; i++) {
			System.out.println("��һ���߳�������Ϊ:" + threadGroup[i].getName());
		}
	}
}
