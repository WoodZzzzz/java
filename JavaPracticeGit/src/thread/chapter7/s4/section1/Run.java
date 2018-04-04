package thread.chapter7.s4.section1;

import java.text.SimpleDateFormat;

public class Run {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String[] dateArray = { "2017-01-01", "2017-02-01", "2017-03-01",
				"2017-04-01", "2017-05-01" };
		MyThread[] threadArray = new MyThread[5];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyThread(sdf, dateArray[i]);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
		
	}
}
