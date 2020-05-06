package entity;

import p_c_test.ValueObject;

public class C {
	private String lock;
	public C(String lock) {
		this.lock = lock;
	}
	public void getValue() {
		try {
			synchronized (lock) {
				while(ValueObject.value.equals("")) {
					System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING了 & ");
					lock.wait();
				}
				System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNING 了 ");
				ValueObject.value = "";
				lock.notifyAll();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
