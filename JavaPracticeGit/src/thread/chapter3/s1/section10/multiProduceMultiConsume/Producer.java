package thread.chapter3.s1.section10.multiProduceMultiConsume;

public class Producer {

	private MyStack stack;
	
	public Producer(MyStack stack) {
		this.stack = stack;
	}
	
	public void pushMethod() {
		stack.push();
	}
}
