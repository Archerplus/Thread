package t12;

public class Run {
	public static void main(String[] args) throws InterruptedException {
//		MyThread thread = new MyThread();
//		thread.start();
		//ʹ��ǰ�߳�˯��
//		Thread.sleep(10000);
//		thread.interrupt();
		//���Ե�ǰ�߳��Ƿ��Ѿ��ж�
		//��ǰ�߳���main,����һֱ��û���ж�
//		System.out.println("�Ƿ�ֹͣ 1? = " + thread.interrupted());
//		System.out.println("�Ƿ�ֹͣ 2? = " + thread.interrupted());
//		System.out.println("end");
		
		
		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ 1? = " + Thread.interrupted());
		System.out.println("�Ƿ�ֹͣ 2? = " + Thread.interrupted());
		System.out.println("end");
		
	}
}
