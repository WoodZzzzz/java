package thread14_innerClass;

import thread14_innerClass.PublicClass.PrivateClass;
import thread14_innerClass.PublicClass.PrivateStaticClass;

public class Test {

	/**
	 * @����: ��̬�ڲ�������ⲿ�ֻ࣬�ܷ��ʳ�Ա��������̬���������ܷ��ʳ�Ա����
	 * 	      �Ǿ�̬�ڲ�����Է����ⲿ����������Ժͷ���
	 * @����: Zhouwj
	 * @��������: 2017��9��22�� ����9:41:45
	 * @param args
	 */
	public static void main(String[] args) {
		PublicClass pu = new PublicClass();
		pu.setUsername("usernameValue");
		pu.setPassword("passwordValue");
		System.out.println(pu.getUsername() + " : " + pu.getPassword());

		PrivateClass pr = pu.new PrivateClass();
		pr.setAddress("addressValue");
		pr.setAge("ageValue");
		System.out.println(pr.getAddress() + " : " + pr.getAge());
		
		PrivateStaticClass psc = new PrivateStaticClass();
		psc.setAddress("staticAddr");
		psc.setAge("staticAge");
	}
}
