package j2se.concurrent;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class TempTest {
	public static void main(String[] args) {
		try {
			//通过反射获取实例方法，但是private不行
			CyclicBarrierTest c = CyclicBarrierTest.class.newInstance();
			System.out.println(c.i);
			//通过unsafe实例化，但是并不会初始化，即使是private也可以
			Field f = Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			Unsafe safe = (Unsafe) f.get(null);
			CyclicBarrierTest c2 = (CyclicBarrierTest) safe.allocateInstance(CyclicBarrierTest.class);
			System.out.println(c2);
			//通过反射构造器创建实例
			Class<?> clazz = CyclicBarrierTest.class;
            Constructor [] cs =  clazz.getDeclaredConstructors();
            for (Constructor con : cs) {
                //用反射强制访问
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
