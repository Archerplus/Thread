package Fair_noFair_test;

import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock;
	public Service(boolean isFair) {
		lock = new ReentrantLock(isFair);
	}
	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("ThreadName = " + Thread.currentThread().getName() + " »ñµÃËø¶¨");
		}finally {
			lock.unlock();
		}
	}
}
