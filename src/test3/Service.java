package test3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	private ReentrantLock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			lock.lock();
			condition.await();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("�� " + lock.getWaitQueueLength(condition) + " ���߳����ڵȴ�newCondition");
			condition.signal();
		}finally {
			lock.unlock();
		}
	}
}
