package threadLocal22;

public class ThreadLocalExt extends ThreadLocal{
	@Override
	protected Object initialValue() {
		return "我是默认值 第一个get不再为null";
	}
}
