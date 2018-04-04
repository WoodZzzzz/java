package thread.chapter3.s3.section4;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
}
