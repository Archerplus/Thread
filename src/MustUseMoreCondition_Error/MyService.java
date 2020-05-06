package MustUseMoreCondition_Error;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private Lock lock = new ReentrantLock();
	public 	Condition condition = lock.newCondition();
	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA ʱ��Ϊ: " + System.currentTimeMillis() 
			+ " ThreadName = " + Thread.currentThread().getName());
			condition.await();
			System.out.println(" end awaitAʱ��Ϊ " + System.currentTimeMillis()
			+ " ThreadName = " + Thread.currentThread().getName());
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			lock.unlock();
		}
	}
	public void awaitB() {
		try {
			lock.lock();
			System.out.println(" begin awaitB ʱ��Ϊ: " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
			condition.await();
			System.out.println(" end awaitB ʱ��Ϊ: " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void signalAll() {
		try {
			lock.lock();
			System.out.println(" signalAllʱ��Ϊ: " + System.currentTimeMillis() + " ThreadName = " + Thread.currentThread().getName());
			condition.signalAll();
		}finally {
			lock.unlock();
		}
	}
}
