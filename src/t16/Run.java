package t16;

public class Run {
	public static void main(String[] args) {
		try {
			RunThread thread = new RunThread();
			thread.start();
			Thread.sleep(1000);
			thread.setRunning(false);
			System.out.println("�Ѿ���ֵΪfalse");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
