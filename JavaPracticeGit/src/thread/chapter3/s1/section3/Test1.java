package thread.chapter3.s1.section3;

public class Test1 {
	public static void main(String[] args) {
		try {
			String str = new String("");
			System.out.println("syn����");
			synchronized (str) {
				System.out.println("lock��һ��");
				str.wait();
				System.out.println("wait�µĴ���");
			}
			System.out.println("syn�µĴ���");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
