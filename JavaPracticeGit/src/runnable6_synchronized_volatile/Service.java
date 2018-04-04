package runnable6_synchronized_volatile;

public class Service {
	private boolean continueRun = true;
	
	public void runMethod() {
		String anyString = new String();
		while (continueRun) {
			synchronized (anyString) {
				System.out.println(1);
			}
		}
		System.out.println("Õ£œ¬¿¥¡À");
	}
	
	public void stopMethod() {
		continueRun = false;
	}
}
