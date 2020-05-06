package suspend_resume_test;

public class Run {
	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5000);
			//A¶Î
			System.out.println("ÔÝÍ£");
			thread.suspend();
			System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());
			System.out.println("¿ªÊ¼Ë¯Ãß");
			Thread.sleep(5000);
			System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());
			//B¶Î
			System.out.println("¿ªÊ¼");
			thread.resume();
			Thread.sleep(5000);
			//C¶Î
			System.out.println("ÔÝÍ£");
			thread.suspend();
			System.out.println("B = " + System.currentTimeMillis() + " i = " + thread.getI());
			Thread.sleep(5000);
			System.out.println("B = " + System.currentTimeMillis() + " i = " + thread.getI());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
