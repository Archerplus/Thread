package entity;

import p_c_test.ValueObject;

public class P {
	private String lock;

	public P(String lock) {
		super();
		this.lock = lock;
	}
	public void setValue() {
		try {
			synchronized (lock) {
				while(!ValueObject.value.equals("")) {
					System.out.println("������ " + Thread.currentThread().getName() + " WAITING �� & ");
					lock.wait();
				}
				System.out.println("������ " + Thread.currentThread().getName() + " RUNNING ��");
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				ValueObject.value = value;
				lock.notifyAll();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
