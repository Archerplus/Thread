package runMethodUseStopMethod;

public class MyThread extends Thread{
	@Override
	public void run() {
		try {
			//����stop����ʱ���׳�java.lang.ThreadDeath�쳣,����ͨ�������,���쳣����Ҫ��ʽ�ز�׽
			//����stop()�Ѿ�������,��Ϊ���ǿ�����߳�ֹͣ���п���ʹһЩ�����Եع����ò������
			//����һ��������Ƕ������ض�������˽���,�������ݵò���ͬ���ش���,�������ݲ�һ�µ�����
			this.stop();
		}catch(ThreadDeath e) {
			System.out.println("������catch()����");
			e.printStackTrace();
		}
	}
	
}
