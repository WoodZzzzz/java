package runnable3_volatile;

public class PrintString implements Runnable {

	private boolean isContinue = true;

	public void setContinue(boolean flag) {
		isContinue = flag;
	}
	
	public boolean getContinue() {
		return isContinue;
	}

	public void printMethod() {
		try {
			while (isContinue == true) {
				System.out.println("run printMethod thread name = "
						+ Thread.currentThread().getName() + " isContinue = " + isContinue);
				Thread.sleep(1000);
			}
//			System.out.println("线程被停止了");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		printMethod();
	}
}
