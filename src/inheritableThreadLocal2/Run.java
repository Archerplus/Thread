package inheritableThreadLocal2;

public class Run {
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				if (i == 5) {
					Tools.t1.set("Archer");
				}
				System.out.println(" ��main�߳���ȡֵ = " + Tools.t1.get());
				Thread.sleep(100);
			}
//			Thread.sleep(100);
			ThreadA a = new ThreadA();
			a.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// ����ʹ��InheritableThreadLocal����Ҫע���һ����
// ������߳���ȡ��ֵ��ͬʱ
// ���߳̽�InheritableThreadLocal�е�ֵ���иı䣬��ô���߳�ȡ����ֵ���Ǿ�ֵ
// û�����о����Ͻ��Ĳ����ر�Ե�����