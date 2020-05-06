package test1;

public class MyThread1 extends Thread{
	private Object lock;

	public Object getLock() {
		return lock;
	}

	public void setLock(Object lock) {
		this.lock = lock;
	}

	public MyThread1(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		try {
			synchronized (lock) {
				System.out.println("��ʼ wait time = " + System.currentTimeMillis());
				lock.wait();
				System.out.println("���� wait time = " + System.currentTimeMillis());
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
