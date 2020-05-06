package service;

public class ThreadA extends Thread {
//	private HasSelfPrivateNum numRef;
//
//	public ThreadA(HasSelfPrivateNum numRef) {
//		super();
//		this.numRef = numRef;
//	}
//	@Override
//	public void run() {
//		numRef.addI("a");
//	}
	private Service service;

	public ThreadA(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		try {
			service.printA();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
