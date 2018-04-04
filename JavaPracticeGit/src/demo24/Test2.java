package demo24;

public class Test2 {

	public static Object object = new Object();
	public static void main(String[] args) {
		 Thread1 thread1 = new Thread1();
		 Thread2 thread2 = new Thread2();
		 thread1.start();
		 
		 try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 thread2.start();
	}

	static class Thread1 extends Thread{
		
		public void run(){
			synchronized(object){
				try {
					object.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("�߳�" + Thread.currentThread().getName() + "�������");
			}
		}
	}	
	
	static class Thread2 extends Thread{
		public void run(){
			synchronized(object){
				object.notify();
				System.out.println("�߳�" + Thread.currentThread().getName() + "������notify()����");
			}
			System.out.println("�߳�" + Thread.currentThread().getName() + "�ͷ�����");
		}
	}
}


