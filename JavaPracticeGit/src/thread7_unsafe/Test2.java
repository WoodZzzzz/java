package thread7_unsafe;

public class Test2 {
	
	public static void main(String[] args) throws InterruptedException {
		PublicVar obj = new PublicVar();
		ThreadA2 t1 = new ThreadA2(obj);
		t1.start();
		Thread.sleep(200);
		obj.getValue();
	}

}
