package suspend_resume_test;

public class Run {
	public static void main(String[] args) {

		try {
			MyThread thread = new MyThread();
			thread.start();
			Thread.sleep(5000);
			//A��
			System.out.println("��ͣ");
			thread.suspend();
			System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());
			System.out.println("��ʼ˯��");
			Thread.sleep(5000);
			System.out.println("A = " + System.currentTimeMillis() + " i = " + thread.getI());
			//B��
			System.out.println("��ʼ");
			thread.resume();
			Thread.sleep(5000);
			//C��
			System.out.println("��ͣ");
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
