package thread_practice.loopPrint;

/**
 * 
 * @����: ���ϵ�,������õķ�ʽ,ԭ��ӳ���Ƕ�����˵,ͨ���ӳ����ַ�ʽ���������.
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��10��11�� ����9:26:33
 */
public class PrintTest implements Runnable {

	public String name;
	public Object prev;
 	public Object self;
	
	public PrintTest(String name, Object prev, Object self) {
		this.name = name;
		this.prev = prev;
		this.self = self;
	}

	@Override
	public void run() {
		int count = 10;
		while (count > 0) {
			synchronized (prev) {
			/*	try {
					Thread.sleep(100);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
//				System.out.println(Thread.currentThread().getName() + name);
				synchronized (self) {
					System.out.print(name);
					count--;
					self.notify();
				}
				try {
					prev.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Object a = new Object();
		Object b = new Object();
		Object c = new Object();
		PrintTest print = new PrintTest("A", c, a);
		new Thread(print).start();
//		Thread.sleep(1000);
		PrintTest print2 = new PrintTest("B", a, b);
		new Thread(print2).start();
//		Thread.sleep(1000);
		PrintTest print3 = new PrintTest("C", b, c);
		new Thread(print3).start();
	}

}


