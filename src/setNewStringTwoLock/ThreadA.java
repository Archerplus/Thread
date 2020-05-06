package setNewStringTwoLock;

public class ThreadA extends Thread {
	private MyService service;

	@Override
	public void run() {
		service.testMethod();
	}

	public MyService getService() {
		return service;
	}

	public void setService(MyService service) {
		this.service = service;
	}

	public ThreadA(MyService service) {
		super();
		this.service = service;
	}

}
