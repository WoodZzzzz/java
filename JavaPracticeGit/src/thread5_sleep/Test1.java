package thread5_sleep;

public class Test1 {

	public static void main(String[] args) {
		MyThread1 my = new MyThread1();
		System.out.println("begin = " + System.currentTimeMillis());
		my.run();  //当前执行线程的名称就是main
		System.out.println("end = " + System.currentTimeMillis());
	}

}
