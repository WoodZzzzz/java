package thread7_unsafe;

/**
 * 
 * @����: ȥ�� HasSelfPrivateNum��addI������synchronized���̲߳���ȫ
 * @��Ȩ: Copyright (c) 2017  
 * @����: zwj
 * @��������: 2017��9��20�� ����3:30:46
 */
public class Test {

	public static void main(String[] args) {
		HasSelfPrivateNum obj = new HasSelfPrivateNum();
		ThreadA t1 = new ThreadA(obj);
		t1.start();
		ThreadB t2 = new ThreadB(obj);
		t2.start();
	}
}
