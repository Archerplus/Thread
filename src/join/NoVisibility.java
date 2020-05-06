package join;

public class NoVisibility {
	private static boolean ready;
	private static int number;
	public static class ReaderThread extends Thread{
		@Override
		public void run() {
			while(!ready) {
				System.out.println(number);
			}
		}
	}
	public static void main(String[] args) {
		new ReaderThread().start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		number = 42;
		ready = true;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
