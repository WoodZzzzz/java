package thread.chapter3.s1.section1;

public class ThreadB extends Thread {

	private MyList list;
	
	public ThreadB(MyList list) {
		this.list = list;
	}
	
	public void run() {
		try {
			while (true) { //while���ַ�ʽ̫�˷�cpu��Դ���ɲ���"�ȴ�/֪ͨ"����
				//�����������list���ܶ��߳�B�ɼ�����Ҳӡ֤��synchronized�������volatileͬ������
				synchronized ("") {
				}
				if (list.size() == 5) {
					System.out.println("����5���˳�");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
