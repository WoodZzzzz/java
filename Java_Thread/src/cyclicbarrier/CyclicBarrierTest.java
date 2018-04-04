package cyclicbarrier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CyclicBarrierTest {

	static CyclicBarrier c = new CyclicBarrier(2);
	
	public static void main(String[] args) {
		
		int i = 0;
		
		System.out.println(i++);
		System.out.println(i);
		
		new Thread(new Runnable() {
			public void run() {
				try {
					c.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				} catch (BrokenBarrierException e) {
					e.printStackTrace();
				}
				System.out.println(1);
			}
		}).start();
		
		try {
			c.await();
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(2);
		HashMap map = new HashMap();
		CopyOnWriteArrayList c = null;
		new Thread();
//		ReadWriteLock
		new ReentrantReadWriteLock();
//		new FutureTask();
//		AbstractQueuedSynchronizer
		try {
			Connection co = DriverManager.getConnection("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
