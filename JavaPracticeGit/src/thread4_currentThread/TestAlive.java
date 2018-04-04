package thread4_currentThread;

public class TestAlive {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		System.out.println("begin == " + my.isAlive());
		my.start();
		System.out.println("end == " + my.isAlive());  //此方法返回true是不一定的，因为有可能main线程在MyThread线程之前执行完。可以在start后面加上休眠时间
	}

}
