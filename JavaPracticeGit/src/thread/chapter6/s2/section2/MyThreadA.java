package thread.chapter6.s2.section2;

public class MyThreadA extends Thread {

	public void run() {
		System.out.println(MyObject.getInstance1().hashCode() + "--" + System.currentTimeMillis());
	}
}

class MyThreadB extends Thread {
	public void run() {
		System.out.println(MyObject.getInstance2().hashCode());
	}
}

class MyThreadC extends Thread {
	public void run() {
		System.out.println(MyObject.getInstance3().hashCode());
	}
}
