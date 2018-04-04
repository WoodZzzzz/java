package thread.chapter3.s1.section1;

public class ThreadB extends Thread {

	private MyList list;
	
	public ThreadB(MyList list) {
		this.list = list;
	}
	
	public void run() {
		try {
			while (true) { //while这种方式太浪费cpu资源，可采用"等待/通知"机制
				//加上下面代码list才能对线程B可见，这也印证了synchronized代码块有volatile同步功能
				synchronized ("") {
				}
				if (list.size() == 5) {
					System.out.println("等于5，退出");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
