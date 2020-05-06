package p_c_test;

public class C {
	private String lock;

	public C(String lock) {
		super();
		this.lock = lock;
	}
	public void getValue() {
		try {
			synchronized (lock) {
				if(ValueObject.value.equals("")) {
					lock.wait();
				}
				System.out.println("getµÄÖµÊÇ:" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
