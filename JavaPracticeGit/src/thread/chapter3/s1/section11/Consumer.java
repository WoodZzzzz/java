package thread.chapter3.s1.section11;

public class Consumer extends Thread {

	private Object obj;

	public Consumer(Object obj) {
		this.obj = obj;
	}

	public void consume() {
		try {
			synchronized (obj) {
				while (ValueObject.value.equals("")) {
					obj.wait();
				}
				System.out.println("getµÄÖµÊÇ" + ValueObject.value);
				ValueObject.value = "";
				obj.notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		while (true) {
			consume();
		}
	}
}
