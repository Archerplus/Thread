package synchronizedmMethodLockObject;

public class ThreadB extends Thread{
	private MyObject objcet;
	public ThreadB(MyObject object) {
		this.objcet = object;
	}
	@Override
	public void run() {
		objcet.methodA();
	}
}
