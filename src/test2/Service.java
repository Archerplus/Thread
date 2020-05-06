package test2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {
	public ReentrantLock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();

	public void serviceMethod1() {
		try {
			lock.lock();
			System.out.println("ThreadName = " + Thread.currentThread().getName() + " 进入方法!");
			Thread.sleep(Integer.MAX_VALUE);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void waitMethod() {
		try {
			lock.lock();
			condition.await();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void notifyMethod() {
		try {
			lock.lock();
			System.out.println("有没有线程正在等待condition? " + lock.hasWaiters(condition) + " 线程数是多少? "
					+ lock.getWaitQueueLength(condition));
			condition.signal();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
