package thread14_innerClass;

import thread14_innerClass.PublicClass.PrivateClass;
import thread14_innerClass.PublicClass.PrivateStaticClass;

public class Test {

	/**
	 * @描述: 静态内部类访问外部类，只能访问成员方法、静态变量、不能访问成员变量
	 * 	      非静态内部类可以访问外部类的所有属性和方法
	 * @作者: Zhouwj
	 * @创建日期: 2017年9月22日 上午9:41:45
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
