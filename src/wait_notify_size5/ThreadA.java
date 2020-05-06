package wait_notify_size5;

public class ThreadA extends Thread {
	private Object lock;

	public ThreadA(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		try {
			synchronized (lock) {
				if(MyList.size() != 5) {
					System.out.println("wait begin " + System.currentTimeMillis());
					lock.wait();
					//日志信息wait end 在最后输出,这也说明notify()方法执行后并不立即释放锁,
					System.out.println("wait end " + System.currentTimeMillis());
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
