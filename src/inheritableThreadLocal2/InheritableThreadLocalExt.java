package inheritableThreadLocal2;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal{
	@Override
	protected Object initialValue() {
		return new Date().getTime();
	}
	@Override
	protected Object childValue(Object parentValue) {
		// TODO Auto-generated method stub
		return parentValue + " 我在子线程加的~!";
	}
}
