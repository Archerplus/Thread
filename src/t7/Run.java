package t7;

public class Run {
	public static void main(String[] args) {
		
//		MyThread mythread = new MyThread();
//		System.out.println("begin = " + mythread.isAlive());
//		mythread.start();
		//��Ȼend == true,����ӡ��ֵΪtrue,
		//����ʵ��mythread.isAlive()��ֵ�ǲ�ȷ����
//		System.out.println("end = " + mythread.isAlive());
		
//		MyThread mythread = new MyThread();
//		System.out.println("begin = " + mythread.isAlive());
//		mythread.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		//���Ϊend == false, ��Ϊmythread�߳��Ѿ���һ����ִ�����
//		System.out.println("end == " + mythread.isAlive());
		
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		System.out.println("main begin t1 isAlive = " + t1.isAlive());
		t1.setName("A");
		t1.start();
		System.out.println("main end t1 isAlive = " + t1.isAlive());
	}
}
