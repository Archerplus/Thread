package test;

public class ThreadB extends Thread {

	private MyObject object;

//ʡ�Թ��췽��
	@Override
	public void run() {
		super.run();
		object.methodB();
	}

	public ThreadB(MyObject object) {
		this.object = object;
	}

	public ThreadB() {

	}
}