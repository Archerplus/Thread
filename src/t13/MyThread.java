package t13;

public class MyThread extends Thread {
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500000; i++) {
				if (this.interrupted()) {
					System.out.println("�Ѿ����ж�״̬��!��Ҫ�˳���!");
					throw new InterruptedException();
				}
				System.out.println("i = " + (i + 1));
			}
			System.out.println("�ұ����,����˴�����for�ּ�������,�̲߳�Ϊֹͣ");
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
