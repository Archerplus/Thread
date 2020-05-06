package t3;

public class ThreadA extends Thread{
	private	PublicVar publicVar;
	@Override
	public void run() {
		publicVar.setValue("B", "BB");
	}
	public ThreadA(PublicVar publicVar) {
		super();
		this.publicVar = publicVar;
	}
	
}
