package thread.chapter3.s1.section10;

public class Substract {

	private Object obj;

	public Substract(Object obj) {
		this.obj = obj;
	}

	public void substract() {
		try {
			synchronized (obj) {
				// Ϊʲôif�ĳ�while��
				// �Ͳ��ᱨ���ˣ�ԭ���ǣ�ִ����while����Ĵ����֮�󣬳�����ٴ��ж�while��������Ƿ����㡣�����߳�ִ�м������൱������ѭ����
				// ���ڶ����߳�ִ�б�����֮��ִ�����18�У�Ȼ�����ж�while������������size=0�������ֻص���ѭ������ȴ��ˣ�
				while (ValueObject.list.size() == 0) {
					System.out.println("thread "
							+ Thread.currentThread().getName() + " begin wait");
					obj.wait();
					System.out.println("thread "
							+ Thread.currentThread().getName() + " end wait");
				}
				ValueObject.list.remove(0);
				System.out.println("list����Ϊ" + ValueObject.list.size());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
