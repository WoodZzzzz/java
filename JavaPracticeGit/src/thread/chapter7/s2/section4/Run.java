package thread.chapter7.s2.section4;

public class Run {

	public static void main(String[] args) {
		System.out.println(" �߳�" + Thread.currentThread().getName()
				+ " ���ڵ��߳�����Ϊ"
				+ Thread.currentThread().getThreadGroup().getName());
		System.out
				.println("main�߳����ڵ��߳���ĸ��߳����������"
						+ Thread.currentThread().getThreadGroup().getParent()
								.getName());
		System.out.println("main�߳����ڵ��߳���ĸ��߳���ĸ��߳���������"
				+ Thread.currentThread().getThreadGroup().getParent()
						.getParent().getName());
	}
}
