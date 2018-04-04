package j2se.concurrent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class TempTest {
	public static void main(String[] args) {
		try {
			//ͨ�������ȡʵ������������private����
			CyclicBarrierTest c = CyclicBarrierTest.class.newInstance();
			System.out.println(c.i);
			//ͨ��unsafeʵ���������ǲ������ʼ������ʹ��privateҲ����
			Field f = Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			Unsafe safe = (Unsafe) f.get(null);
			CyclicBarrierTest c2 = (CyclicBarrierTest) safe.allocateInstance(CyclicBarrierTest.class);
			System.out.println(c2);
			//ͨ�����乹��������ʵ��
			Class<?> clazz = CyclicBarrierTest.class;
            Constructor [] cs =  clazz.getDeclaredConstructors();
            for (Constructor con : cs) {
                //�÷���ǿ�Ʒ���
            	con.setAccessible(true);
            	CyclicBarrierTest o =  (CyclicBarrierTest)con.newInstance();
                System.out.println(o.i);
            }

			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
