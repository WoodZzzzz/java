package thread10_synchronized;

public class Service2 {

	public void serviceMethod(MyOneList2 list, String data) {
		try {
			synchronized (list) {  //ȥ������ͻ�����̲߳���ȫ���������ʹlist��if������������ͷ�list������
				if (list.getSize() < 1) {
					/*
					 * �������Ƚ�����߳�A���ߣ����������ú������߳�BҲ��������жϣ���Ϊ�߳�A�Ѿ��ͷ���list������
					 * �߳�B�պÿ��Խ���getSize
					 * ����ʱ����size����0�����������̶߳�����������жϣ����������̶߳��������Ԫ�ء�
					 */
					Thread.sleep(2000);
					list.add(data);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
