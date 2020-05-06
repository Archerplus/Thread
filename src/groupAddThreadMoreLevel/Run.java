package groupAddThreadMoreLevel;

public class Run {
	public static void main(String[] args) {
		//��main�������һ���߳���A,Ȼ�������A��������̶߳���Z
		//����activeGroupCount()��activeCount()��ֵ���ǹ̶���
		//��ϵͳ�л�����һ������
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		ThreadGroup group = new ThreadGroup(mainGroup,"A");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					System.out.println("runMethod!");
					Thread.sleep(1000);//�̱߳���������״̬�ſ����������
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		Thread newThread = new Thread(group,runnable);
		newThread.setName("Z");
		newThread.start();//�̱߳�������Ȼ��Ź鵽��A��
		ThreadGroup[] listGroup = new ThreadGroup[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(listGroup);
		System.out.println("main�߳����ж������߳��飺" + listGroup.length + " ����Ϊ:  " + listGroup[0].getName());
		Thread[] listThread = new Thread[listGroup[0].activeCount()];
		listGroup[0].enumerate(listThread);
		System.out.println(listThread[0].getName());
	}
}
