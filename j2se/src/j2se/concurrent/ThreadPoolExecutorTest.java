package j2se.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {

	public static class ThreadA implements Runnable, Comparable, ThreadFactory {

		public void run() {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "ִ�����");
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Thread newThread(Runnable r) {
			return new Thread();
		}
	}

	public static void main(String[] args) {
		//�Զ���ܾ�����
	/*	ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1,
				TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(10), new MyRejectedHandler());*/
		// �̹߳���
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1,
				TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(4), new ThreadA(), new ThreadPoolExecutor.AbortPolicy());
		for (int i = 0; i < 21; i++) {
			ThreadA t = new ThreadA();
			executor.execute(t);
			System.out.println("�̳߳����߳���Ŀ��:" + executor.getPoolSize()
					+ ",�����еȴ��������У�" + executor.getQueue().size() + ",��ִ�������Ŀ��:"
					+ executor.getCompletedTaskCount());
		}
		executor.shutdown();
		doCallAndFuture();
		
		ExecutorService executor3 = Executors.newFixedThreadPool(10);
		Executors.newCachedThreadPool();
		Executors.newScheduledThreadPool(190);
		Executors.newSingleThreadExecutor();
		
	}
	
	public static void doCallAndFuture() {
		Callable call = new ThreadB();
		FutureTask future = new FutureTask(call);
		new Thread(future).start();
		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	
	}
	
	public static class ThreadB implements Callable {

		@Override
		public Object call() throws Exception {
			System.out.println(Thread.currentThread() + "---");
			return "sdfj";
		}
		
	}
	
	/**
	 * �Զ���ܾ�����
	 */
	public static class MyRejectedHandler implements RejectedExecutionHandler {

		@Override
		public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
			System.out.println("�ܾ�����");
		}
		
	}

}
