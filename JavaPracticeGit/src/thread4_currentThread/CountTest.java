package thread4_currentThread;

/**
 * 
 * @����: this��Thread.currentThread������
 *      ���ˣ��������this.getName()��currentThread�õ����߳�����һ��
 *      ������ͨ�����߳���Ķ���������ķ�ʽ���ݸ�Thread���󲢽���������������ǱȽϺõ�˵��
 * @��Ȩ: Copyright (c) 2017
 * @����: zwj
 * @��������: 2017��9��18�� ����8:50:42
 */
public class CountTest {

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		// System.out.println("c" + c);
		Thread t1 = new Thread(c)/*
								 * { public void run(){
								 * System.out.println(this.getName()); } }
								 */;
		t1.setName("A");
		t1.start();
		// System.out.println("t1" + t1);
		/*
		 * begin main Thread-0 end
		 * 
		 * run-begin A Thread-0 ????Ϊʲô
		 * ��Ϊrun������ʱ����ʵ������ͨ��c���������õģ���Ϊ��û����дt1��run����,����ͼ9-11�е�ע�� end
		 */
	}

}
