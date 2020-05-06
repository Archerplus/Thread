package synNotExtends;

public class ThreadB extends Thread{
	private Sub sub;

	public ThreadB(Sub sub) {
		super();
		this.sub = sub;
	}
	@Override
	public void run() {
		sub.serviceMethod();
	}
}
