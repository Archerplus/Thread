package join;

public class JoinMain {
	private volatile static int i = 0;
	public static class AddMethod extends Thread{
		@Override
		public void run() {
			for(i = 0;i < 100;i++) {
//				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		AddMethod at = new AddMethod();
		at.start();
		//������ǰ�߳�,
		//ʹ����join�������߳�ִ����֮��ǰ�̲߳���ִ��
		at.join();
		System.out.println("hello world");
		Thread.sleep(100);
		System.out.println(i);
	}
}
