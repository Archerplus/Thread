package join;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock implements Runnable {
	//�����캯���Ĳ���Ϊtrueʱ,��ʾ��ʱ��ƽ��
	//��ƽ��������������,����Ҫʵ�ֹ�ƽ����ȻҪ��ϵͳά��һ���������
	//��Ϊ��ƽ����ʵ�ֳɱ��Ƚϸ�,����Ҳ��Զ��ԱȽϵ���
	//���,Ĭ�������,���Ƿǹ�ƽ��,���û���ر�����
	//Ҳ����Ҫʹ�ù�ƽ��
	//��ƽ���ͷǹ�ƽ�����̵߳��ȱ�����Ҳ�Ƿǳ���һ��
	public static ReentrantLock fairlock = new ReentrantLock(true);

	@Override
	public void run() {
		while (true) {
			try {
				fairlock.lock();
				System.out.println(Thread.currentThread().getName() + "�����");
			} finally {
				fairlock.unlock();
			}
		}
	}
	public static void main(String[] args) {
		FairLock r1 = new FairLock();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
	}
}
