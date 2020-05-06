package waitOld;

import org.omg.CORBA.portable.ValueOutputStream;

public class Add {
	private String lock;

	public Add(String lock) {
		super();
		this.lock = lock;
	}
	public void add() {
		synchronized (lock) {
			ValueObject.list.add("anything");
			lock.notifyAll();
		}
	}
}
