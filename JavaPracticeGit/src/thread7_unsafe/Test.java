package thread7_unsafe;

/**
 * 
 * @描述: 去掉 HasSelfPrivateNum的addI方法的synchronized则线程不安全
 * @版权: Copyright (c) 2017  
 * @作者: zwj
 * @创建日期: 2017年9月20日 下午3:30:46
 */
public class Test {

	public static void main(String[] args) {
		HasSelfPrivateNum obj = new HasSelfPrivateNum();
		ThreadA t1 = new ThreadA(obj);
		t1.start();
		ThreadB t2 = new ThreadB(obj);
		t2.start();
	}
}
