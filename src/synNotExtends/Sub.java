package synNotExtends;

public class Sub extends Main{
	@Override
	public synchronized void serviceMethod() {
		try {
			System.out.println("int sub ��һ�� sleep begin threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
			Thread.sleep(1000);
			System.out.println("int sub ��һ�� sleep end threadName = " + Thread.currentThread().getName() + " time = " + System.currentTimeMillis());
			super.serviceMethod();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
