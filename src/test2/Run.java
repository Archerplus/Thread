package test2;

public class Run {	
//	public static void main(String[] args) {
//		Demo4 demo4 = new Demo4();
//		ThreadA a = new ThreadA(demo4);
//		a.setName("a");
//		a.start();
//		ThreadB b = new ThreadB(demo4);
//		b.setName("b");
//		b.start();
//	}
	public static void main(String[] args) throws InterruptedException {
		final Service service = new Service();
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				service.serviceMethod1();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i = 0;i < 10;i++) {
			threadArray[i] = new Thread(runnable);
		}
		for(int i = 0;i < 10;i++) {
			threadArray[i].start();
		}
		Thread.sleep(2000);
		System.out.println("���߳���: " + service.lock.getQueueLength() + " �ڵȴ���ȡ��");
	}
}
//����int getQueueLength()
//�������ȴ���ȡ���������̹߳�����


