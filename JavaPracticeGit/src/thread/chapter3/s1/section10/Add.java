package thread.chapter3.s1.section10;

public class Add {

	private Object obj;
	
	public Add(Object obj) {
		this.obj = obj;
	}
	
	public void add() {
		synchronized (obj) {
			ValueObject.list.add("zwj");
			obj.notifyAll();
		}
	}
}
