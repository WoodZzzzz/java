package thread.chapter3.s3.section3;

public class Run {
	
	public static ThreadLocalExt t1 = new ThreadLocalExt();
	
	public static void main(String[] args) {
		if (t1.get() == null) {
			System.out.println("第一次还是空的");
			t1.set("手动设置值");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
