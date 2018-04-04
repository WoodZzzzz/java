package thread.chapter6.s2.section2;

public class MyObject {

	private volatile static MyObject obj;

	private MyObject() {
	}

	/**
	 * 
	 * @����: ����ģʽ������Ч�ʵ���
	 * @����: Zhouwj
	 * @��������: 2017��10��19�� ����8:47:31
	 * @return
	 */
	public synchronized static MyObject getInstance1() {
		if (obj == null) {
			obj = new MyObject();
		}
		return obj;
	}

	/**
	 * 
	 * @����: Ч�ʵ��£�ͬ�� 
	 * @����: Zhouwj
	 * @��������: 2017��10��19�� ����8:47:51
	 * @return
	 */
	public static MyObject getInstance2() {
		synchronized (MyObject.class) {
			if (obj == null) {
				obj = new MyObject();
			}
		}
		return obj;
	}
	
	public static MyObject getInstance3() {
		if (obj == null) {
			synchronized (MyObject.class) {
				if (obj == null) {
					obj = new MyObject();
				}
			}
		}
		return obj;
	}
}
