package stopThrowLock;

public class MyThread extends Thread{
	private SynchronizedObject object;
	
	public MyThread(SynchronizedObject object) {
		super();
		this.object = object;
	}

	public SynchronizedObject getObject() {
		return object;
	}

	public void setObject(SynchronizedObject object) {
		this.object = object;
	}
	@Override
	public void run() {
		object.printString("b", "bb");
	}
}
