package j2se.jvm;

public class JVMBlockDemo {

	private final int i = 0; 
	
	private Object obj = new Object(); //可以成为gc root
	
	
	
	public int addMethod(int i) {
		int j = 0;
		int sum = i + j;
		Object oj = obj;  //可以成为gc root
		long start = System.currentTimeMillis();
		
		return 0;
	}
	
	public void a() {
		b();
	}
	
	public void b() {
		a();
	}
}
