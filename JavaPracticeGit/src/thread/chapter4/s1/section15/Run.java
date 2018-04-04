package thread.chapter4.s1.section15;

public class Run {
	
	public static void main(String[] args) {
		Service service = new Service();
		MyThreadA a = new MyThreadA(service);
		a.start();
	}
}
