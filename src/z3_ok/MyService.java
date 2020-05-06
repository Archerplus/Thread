package z3_ok;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void waitMethod() {
		try {
			lock.lock();
			System.out.println("A");
			condition.await();
			System.out.println("B");
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
			System.out.println("À¯ Õ∑≈¡À");
		}
	}
}
