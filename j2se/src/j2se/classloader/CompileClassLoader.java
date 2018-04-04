package j2se.classloader;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLClassLoader;

import sun.misc.Unsafe;

public class CompileClassLoader extends ClassLoader {

	protected Class<?> findClass(String name) throws ClassNotFoundException {
		System.out.println(name);
		return null;
	}

	public static void main(String[] args) throws Exception {
		String proClass = "j2se.classloader.Hello";
		String[] proArgs = new String[] { "123" };
		CompileClassLoader ccl = new CompileClassLoader();
		Class<?> clazz = ccl.loadClass(proClass);
		/*Field a =clazz.getField("j");
		// 获取类运行的主方法
		Method main = clazz.getMethod("main", (new String[0]).getClass());
		Object[] argsArray = { proArgs };
		main.invoke(null, argsArray);*/
		System.out.println("-----");
		Class<?> clazz2 = Class.forName(proClass);
		Field a =clazz2.getDeclaredField("j");
		System.out.println("j=====" );
		
		System.out.println("实例化的几种方式");
		System.out.println("方法一: newInstance");
		Hello h = Hello.class.newInstance();
		System.out.println(h.j);
		System.out.println("方法二：Constructor");
		Constructor<Hello> con = Hello.class.getDeclaredConstructor(new Class[]{int.class});
		Constructor<Hello> con2 = Hello.class.getDeclaredConstructor(new Class[] {});
		Hello h2 = con2.newInstance();
		System.out.println("h2" + h2);
		Hello hh = con.newInstance(1009);
		System.out.println(hh.j);
		System.out.println("方法三：Unsafe");
		Field f = Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe = (Unsafe) f.get(null);
		Hello he = (Hello) unsafe.allocateInstance(Hello.class);
		he.j = 1;
		System.out.println(he.j);
		System.out.println(he);
	}
}
