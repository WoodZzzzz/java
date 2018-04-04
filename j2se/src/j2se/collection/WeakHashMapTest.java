package j2se.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WeakHashMapTest {

	public ExecutorService exec = Executors.newFixedThreadPool(5);
	public Map<Task, TaskStatus> taskStatus = Collections
			.synchronizedMap(new WeakHashMap<Task, TaskStatus>());

	private enum TaskStatus {
		NOT_STARTED, STARTED, FINISHED
	};

	private class Task implements Runnable {
		
		public void run() {
			taskStatus.put(this, TaskStatus.NOT_STARTED);
				try {
					Thread.sleep(2900);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName() + this);
			taskStatus.put(this, TaskStatus.FINISHED);
		}
	}
	
	public Task newTask() {
		Task t = new Task();
		taskStatus.put(t, TaskStatus.NOT_STARTED);
		exec.execute(t);
		return t;
	}
	
	public static void main(String[] args) {
		WeakHashMapTest t = new WeakHashMapTest();
		for (int i = 0; i < 100000000; i++){
			t.newTask();
		}
	}
}
