package userReturnInterrupt;

public class MyThread extends Thread{
	@Override
	public void run() {
		while(true) {
			//����isInterrupted������return����ֹ�߳�
			//�������ǽ��������쳣�ķ�����ʵ���̵߳�ֹͣ
			//��Ϊ��catch���л����Խ��쳣������,ʹ�߳�ֹͣ���¼����Դ���
			if(this.isInterrupted()) {
				System.out.println("ֹͣ��");
				return ;
			}
			System.out.println("timer = " + System.currentTimeMillis());
		}
	}
}
