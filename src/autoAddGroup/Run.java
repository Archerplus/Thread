package autoAddGroup;

public class Run {
	public static void main(String[] args) {
		// ����activeGroupCount()ȡ�õ�ǰ�߳�������е����߳�������
		// ����enumerate()�������ǽ��߳����е� ���߳����Ը��Ƶ���ʽ
		// ������ThreadGroup[]���������
		System.out.println("A���̣߳�" + Thread.currentThread().getName() + " �������߳�����Ϊ��"
				+ Thread.currentThread().getThreadGroup().getName() + " " + " �����߳���������"
				+ Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] threadGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadGroup);
	}
}
