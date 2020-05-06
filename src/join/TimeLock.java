package join;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TimeLock implements Runnable{
	public static ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		try {
			if(lock.tryLock(5, TimeUnit.SECONDS)) {
				Thread.sleep(6000);
			}else {
				System.out.println("get lock failed");
			}
		}catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			if(lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
	public static void main(String[] args) {
		TimeLock t1 = new TimeLock();
		Thread t2 = new Thread(t1);
		Thread t3 = new Thread(t1);
		t2.start();
		t3.start();
	}
}
