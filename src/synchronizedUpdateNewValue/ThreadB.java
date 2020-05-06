package synchronizedUpdateNewValue;

public class ThreadB extends Thread{
	private Service service;
	
	public ThreadB(Service service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		System.out.println("Ïß³ÌÍ£Ö¹");
		service.stopMethod();
	}
}	
