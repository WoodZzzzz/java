package thread.chapter3.s3.section3;

public class Run {
	
	public static ThreadLocalExt t1 = new ThreadLocalExt();
	
	public static void main(String[] args) {
		if (t1.get() == null) {
			System.out.println("��һ�λ��ǿյ�");
			t1.set("�ֶ�����ֵ");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
