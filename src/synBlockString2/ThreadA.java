package synBlockString2;

public class ThreadA extends Thread{
	private Service service;
	public ThreadA() {
		// TODO Auto-generated constructor stub
	}
	public ThreadA(Service service) {
		this.service = service;
	}
	@Override
	public void run() {
		service.a();
	}
}
