package ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	public void set() {
		try {
			lock.lock();
			while(hasValue == true) {
				condition.await();
			}
			System.out.println("��ӡ*****");
			hasValue = true;
			condition.signal();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void get() {
		try {
			lock.lock();
			while(hasValue == false) {
				condition.await();
			}
			System.out.println("��ӡ&&&&&");
			hasValue = false;
			condition.signal();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}