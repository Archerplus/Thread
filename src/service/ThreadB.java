package service;

public class ThreadB extends Thread{
//	private HasSelfPrivateNum numRef;
//
//	public HasSelfPrivateNum getNumRef() {
//		return numRef;
//	}
//
//	public void setNumRef(HasSelfPrivateNum numRef) {
//		this.numRef = numRef;
//	}
//
//	public ThreadB(HasSelfPrivateNum numRef) {
//		super();
//		this.numRef = numRef;
//	}
//	@Override
//	public void run() {
//		numRef.addI("b");
//	}
	private Service service;

	public ThreadB(Service service) {
		this.service = service;
	}

	@Override
	public void run() {
		service.printB();
	}
}
