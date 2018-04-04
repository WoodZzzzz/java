package thread.chapter7.s4.section2;

import java.text.SimpleDateFormat;

public class Run2 {

	public static void main(String[] args) {
		String[] dateArray = { "2017-01-01", "2017-02-01", "2017-03-01",
				"2017-04-01", "2017-05-01" };
		MyThread2[] threadArray = new MyThread2[5];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread2(dateArray[i], "yyyy-MM-dd");
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}

	}
}
