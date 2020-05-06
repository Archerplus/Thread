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
					System.out.println("������ " + Thread.currentThread().getName() + " WAITING�� & ");
					lock.wait();
				}
				System.out.println("������ " + Thread.currentThread().getName() + " RUNNING �� ");
				ValueObject.value = "";
				lock.notifyAll();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
