package thread.chapter3.s4.section2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

	protected Object initialValue() {
		return new Date().getTime();
	}
	
	protected Object childValue(Object parentValue) {
		return parentValue + "×ÓÏß³Ì";
	}
	
}
