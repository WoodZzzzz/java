package j2se.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask extends RecursiveTask {

	private static final int threshold = 2;
	private int start;
	private int end;
	int sum = 0;

	public ForkJoinTask(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	protected Object compute() {
		
		boolean canCompute = false;
		canCompute = (end - start) <= threshold;
		if (canCompute) {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		} else {
			int middle = (start + end) / 2;
			ForkJoinTask leftTask = new ForkJoinTask(start, middle);
			ForkJoinTask rightTask = new ForkJoinTask(middle, end);

			leftTask.fork();
			rightTask.fork();

			int leftResult = (int) leftTask.join();
			int rightResult = (int) rightTask.join();
			sum = leftResult + rightResult;
		}
		return sum;
	}

	public static void main(String[] args) {
		ForkJoinPool forkJoinPool = new ForkJoinPool(1);
		
		ForkJoinTask task = new ForkJoinTask(1, 100);
		try {
			System.out.print(forkJoinPool.submit(task).get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}