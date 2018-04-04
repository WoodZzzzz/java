package thread10_synchronized;

/**
 * 
 * @描述: add方法是同步的，但是多个线程执行add方法是异步的，在线程A添加完元素的过程中，线程B也可以添加元素 ,
 * 这就有可能导致脏读
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年9月21日 下午3:52:26
 */
public class MyTest {

	public static void main(String[] args) {
		MyList list = new MyList();
		MyThreadA t1 = new MyThreadA(list);
		t1.setName("A");
		t1.start();
		MyThreadB t2 = new MyThreadB(list);
		t2.setName("B");
		t2.start();
	}
}
