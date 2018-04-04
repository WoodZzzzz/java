package demo3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*Random ran = new Random();
		int m = ran.nextInt(100);
		int n = ran.nextInt(100);
		System.out.println("m is " + m + ", n is " + n);
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		System.out.println("Is " + i + " equal by " +  m + " and " + n + "?" + (m + n == i));*/
		
		A a = new A("2017-01");
		A a2 = new A("2017-02");
		A a3 = new A("2017-03");
		A a4 = new A("2017-04");
		A a5 = new A("2017-05");
		A a6 = new A("2017-06");
		a.start();
		a2.start();
		a3.start();
		a4.start();
		a5.start();
		a6.start();
	}

}

class A extends Thread {
	
	private String time;
	
	public A(String time) {
		this.time = time;
	}
	
	public synchronized void run() {
		String[] args = getDayOfMonth(time);
		System.out.println(args[0] + "---" + args[1]);
	}
	
	public static String[] getDayOfMonth(String date_time)
    {
        //这两个对象是可以静态的,但日历会共享,多线程下要加锁
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        calendar.set(Calendar.YEAR, Integer.valueOf(date_time.split("-")[0]));
        calendar.set(Calendar.MONTH, Integer.valueOf(date_time.split("-")[1]) - 1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        String first_day = format.format(calendar.getTime());
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last_day = format.format(calendar.getTime());
        return new String[] { first_day, last_day };
    }
}
