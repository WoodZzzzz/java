package thread.chapter4.s1.section8;

public class Run {

	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA[] aArray = new ThreadA[10];
		ThreadB[] bArray = new ThreadB[10];
		for (int i = 0; i < aArray.length; i++) {
			aArray[i] = new ThreadA(service);
			bArray[i] = new ThreadB(service);
			aArray[i].start();
			bArray[i].start();
		}
	}
}
