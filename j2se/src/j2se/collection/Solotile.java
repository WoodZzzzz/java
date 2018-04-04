package j2se.collection;

import java.util.Collections;

public class Solotile implements Runnable {

	boolean running = true;
	int i = 0;
	
	public void run() {
		while (running) {
			i++;
			System.out.println(i);
		}
	}
    
	public static void main(String[] args) throws InterruptedException{
		Solotile s = new Solotile();
		Thread t = new Thread(s);
		t.start();
		Thread.sleep(10);
		s.running = false;
		Thread.sleep(1000);
		System.out.println("³ÌÐòÍ£Ö¹");
		System.out.println(s.i);
		
		
	}

}