package synchronizedUpdateNewValue;

public class ThreadA extends Thread {
	private Service service;

	public ThreadA(Service service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		System.out.println("线程运行");
		service.runMethod();
	}
}
