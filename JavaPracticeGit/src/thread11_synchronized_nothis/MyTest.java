package thread11_synchronized_nothis;


/**
 * 
 * @描述: 非this的对象锁 
 *  多线程执同时执行sychronized(x){} 代码块时呈同步效果
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年9月21日 下午4:48:21
 */
public class MyTest {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
//		MyObject obj2 = new MyObject();
		Service service = new Service();
		MyThreadA t1 = new MyThreadA(service, obj);
		t1.setName("A");
		t1.start();
//		MyThreadB t2 = new MyThreadB(service, obj2);
		MyThreadB t2 = new MyThreadB(service, obj);
		t2.setName("B");
		t2.start();
	}
}
