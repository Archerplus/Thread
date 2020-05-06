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
		//阻塞当前线程,
		//使调用join方法的线程执行完之后当前线程才能执行
		at.join();
		System.out.println("hello world");
		Thread.sleep(100);
		System.out.println(i);
	}
}
