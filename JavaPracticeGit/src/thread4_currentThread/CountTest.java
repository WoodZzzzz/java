package thread4_currentThread;

/**
 * 
 * @描述: this和Thread.currentThread的区分
 *      个人：如果想让this.getName()和currentThread得到的线程名不一样
 *      ，可以通过将线程类的对象构造参数的方式传递给Thread对象并进行启动。此类就是比较好的说明
 * @版权: Copyright (c) 2017
 * @作者: zwj
 * @创建日期: 2017年9月18日 下午8:50:42
 */
public class CountTest {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		// System.out.println("c" + c);
		Thread t1 = new Thread(c)/*
								 * { public void run(){
								 * System.out.println(this.getName()); } }
								 */;
		t1.setName("A");
		t1.start();
		// System.out.println("t1" + t1);
		/*
		 * begin main Thread-0 end
		 * 
		 * run-begin A Thread-0 ????为什么
		 * 因为run方法的时候是实际上是通过c对象来调用的，因为并没有重写t1的run方法,如上图9-11行的注释 end
		 */
	}

}
