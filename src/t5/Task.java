package t5;

public class Task {
	private String getData1;
	private String getData2;
	
	synchronized public void doLongTimeTask() {
		try {
			System.out.println("begin task");
			Thread.sleep(1000);
			getData1 = " ��ʱ�䴦��������Զ�̷��ص�ֵ1 threadName = " + Thread.currentThread().getName()	;
			getData2 = " ��ʱ�䴦��������Զ�̷��ص�ֵ2 threadName = " + Thread.currentThread().getName();
			System.out.println(getData1);
			System.out.println(getData2);
			System.out.println("end task");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}