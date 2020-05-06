package testDemo;

public class DeadLockDemo {
	private static String A = "A";
	private static String B = "B";
	public static void main(String[] args) {
		new DeadLockDemo().deadLock();
	}
	private void deadLock() {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (A) {
					try {
						Thread.currentThread().sleep(2000);
					}catch (Exception e) {
						e.printStackTrace();
					}
					synchronized (B) {
						System.out.println("BBB");
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (B) {
					synchronized (A) {
						System.out.println("AAA");
					}
				}
			}
		});
		t1.start();
		t2.start();
	}
}
