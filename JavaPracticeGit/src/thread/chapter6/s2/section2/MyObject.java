package thread.chapter6.s2.section2;

public class MyObject {

	private volatile static MyObject obj;

	private MyObject() {
	}

	/**
	 * 
	 * @描述: 单例模式，但是效率低下
	 * @作者: Zhouwj
	 * @创建日期: 2017年10月19日 下午8:47:31
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
	 * @描述: 效率低下，同上 
	 * @作者: Zhouwj
	 * @创建日期: 2017年10月19日 下午8:47:51
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
