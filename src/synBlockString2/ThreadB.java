package synBlockString2;

public class ThreadB extends Thread{
	private Service service;
	public ThreadB() {
		// TODO Auto-generated constructor stub
	}
	public ThreadB(Service service) {
		this.service = service;
	}
	@Override
	public void run() {
		service.b();
	}
}
