package synchronizedUpdateNewValue;

public class Run {
	public static void main(String[] args) {
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.start();
			Thread.sleep(1000);
			ThreadB b = new ThreadB(service);
			b.start();
			System.out.println("�Ѿ�����ֹͣ��������! ");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}


//�ؼ���synchronized���Ա�֤��ͬһʱ��
//ֻ��һ���߳̿���ִ��ĳһ��������ĳһ�������
//��������������:�����ԺͿɼ���
//ͬ��synchronized�������Խ��һ���߳̿��������ڲ�һ�µ�״̬
//�����Ա�֤����ͬ����������ͬ��������ÿ���߳�
//��������ͬһ��������֮ǰ���е��޸�Ч��