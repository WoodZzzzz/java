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
				System.out.println("线程" + Thread.currentThread().getName() + "获得了锁");
			}
		}
	}	
	
	static class Thread2 extends Thread{
		public void run(){
			synchronized(object){
				object.notify();
				System.out.println("线程" + Thread.currentThread().getName() + "调用了notify()方法");
			}
			System.out.println("线程" + Thread.currentThread().getName() + "释放了锁");
		}
	}
}


