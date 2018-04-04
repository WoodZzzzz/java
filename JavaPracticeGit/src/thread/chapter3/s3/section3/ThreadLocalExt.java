package thread.chapter3.s3.section3;

public class ThreadLocalExt extends ThreadLocal {

	@Override
	protected Object initialValue() {
		return "д╛хож╣";
	}
}
