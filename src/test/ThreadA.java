package test;

public class ThreadA extends Thread {

	private MyObject object;

	public ThreadA(MyObject object) {
		this.object = object;
	}

	// ʡ�Թ��췽��
	@Override
	public void run() {
		super.run();
		object.methodA();
	}

	public ThreadA() {
		
	}
}