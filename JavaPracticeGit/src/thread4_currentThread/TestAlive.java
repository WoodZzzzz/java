package thread4_currentThread;

public class TestAlive {

	public static void main(String[] args) {
		MyThread my = new MyThread();
		System.out.println("begin == " + my.isAlive());
		my.start();
		System.out.println("end == " + my.isAlive());  //�˷�������true�ǲ�һ���ģ���Ϊ�п���main�߳���MyThread�߳�֮ǰִ���ꡣ������start�����������ʱ��
	}

}
