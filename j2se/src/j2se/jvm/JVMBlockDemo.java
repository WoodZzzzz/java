package j2se.jvm;

public class JVMBlockDemo {

	private final int i = 0; 
	
	private Object obj = new Object(); //���Գ�Ϊgc root
	
	
	
	public int addMethod(int i) {
		int j = 0;
		int sum = i + j;
		Object oj = obj;  //���Գ�Ϊgc root
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
