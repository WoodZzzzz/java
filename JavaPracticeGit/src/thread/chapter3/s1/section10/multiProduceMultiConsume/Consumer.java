package thread.chapter3.s1.section10.multiProduceMultiConsume;

public class Consumer {

	private MyStack stack;
	
	public Consumer(MyStack stack) {
		this.stack = stack;
	}
	
	public void popMethod() {
		System.out.println("popMethod " + stack.pop());
	}
}
