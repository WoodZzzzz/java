package ibm.thread;

public class BSync extends Thread {

	int totalThreads;
	int currentThread;

	public BSync(int c) {
		totalThreads = c;
		currentThread = 0;
	}

	public void waitForAll() {
		currentThread++;
		if (currentThread < totalThreads) {
			try {
				/*
				 * Causes the current thread to wait until another thread
				 * invokes the java.lang.Object.notify() method or the
				 * java.lang.Object.notifyAll() method for this object. In other
				 * words, this method behaves exactly as if it simply performs
				 * the call wait(0).
				 */
				wait();
//				setDaemon(true); ????
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			/*
			 * Wakes up all threads that are waiting on this object's monitor. A
			 * thread waits on an object's monitor by calling one of the wait
			 * methods.
			 */
			notifyAll();

			/*
			 * Wakes up a single thread that is waiting on this object's
			 * monitor. If any threads are waiting on this object, one of them
			 * is chosen to be awakened. The choice is arbitrary and occurs at
			 * the discretion of the implementation. A thread waits on an
			 * object's monitor by calling one of the wait methods.
			 */
			// notify();
			/*
			 * Causes the currently executing thread object to temporarily pause
			 * and allow other threads to execute.
			 */
//			yield();
			currentThread = 0;
		}
	}

}
