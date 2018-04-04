package thread14_innerClass;

import thread14_innerClass.OutClass.InnerClass;

public class Run {

	public static void main(String[] args) {
		final InnerClass inner = new InnerClass();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				inner.method1();
			}
		}, "A");
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				inner.method2();
			}
			
		}, "B");
		
		t1.start();
		t2.start();
	}
}
