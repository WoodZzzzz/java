package thread11_synchronized_nothis;

/**
 * 
 * @描述: synchronized(x){}对象被线程访问时，其他线程对x的其他同步方法是同步效果的。
 * @版权: Copyright (c) 2017
 * @作者: zwj
 * @创建日期: 2017年9月21日 下午4:59:47
 */
public class MyTestC {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		Service se = new Service();

		MyThreadA t1 = new MyThreadA(se, obj);
		t1.setName("A");
		t1.start();
		MyThreadB t2 = new MyThreadB(se, obj);
		t2.setName("B");
		t2.start();
		MyThreadC t3 = new MyThreadC(obj);
		t3.setName("C");
		t3.start();
	}

}
