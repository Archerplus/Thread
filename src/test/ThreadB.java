package test;

public class ThreadB extends Thread {

	private MyObject object;

//省略构造方法
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