package thread5_suspend_resume;

/**
 * 
 * @����: suspend�����Ķ�ռ������
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��9��19�� ����4:39:52
 */
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		final MyThread2 my = new MyThread2();
		Thread t = new Thread() {
			public void run() {
				my.printString();
			}
		};
		t.setName("a");
		t.start();
		Thread.sleep(1000);
		
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("t2�����ˣ����ǽ��벻��printString����");
				my.printString();
			}
		};
		t2.start();
	}

}
