package thread5_sleep;

public class Test1 {

	public static void main(String[] args) {
		MyThread1 my = new MyThread1();
		System.out.println("begin = " + System.currentTimeMillis());
		my.run();  //��ǰִ���̵߳����ƾ���main
		System.out.println("end = " + System.currentTimeMillis());
	}

}
