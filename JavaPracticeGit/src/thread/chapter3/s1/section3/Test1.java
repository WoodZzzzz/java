package thread.chapter3.s1.section3;

public class Test1 {
	public static void main(String[] args) {
		try {
			String str = new String("");
			System.out.println("syn上面");
			synchronized (str) {
				System.out.println("lock第一行");
				str.wait();
				System.out.println("wait下的代码");
			}
			System.out.println("syn下的代码");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
