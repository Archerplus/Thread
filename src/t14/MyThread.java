package t14;

public class MyThread extends Thread{
	@Override
	public void run() {
		//�����sleep״̬��ֹͣĳһ�߳�,�����catch���
		//�������ֹͣ״ֵ̬,ʹ֮���false
		try {
			System.out.println("run begin");
			Thread.sleep(10000000);
			System.out.println("run end");
		} catch (InterruptedException e) {
			System.out.println("�ڳ�˯�б�ֹͣ,����catch" + this.isInterrupted());
			e.printStackTrace();
		}
	}
}
