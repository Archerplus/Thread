package setNewStringTwoLock;

public class Run1 {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service);
		a.setName("A");
		b.setName("B");
		a.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.start();
	}
}



//emmmmm,����ȥ�ô�����
//��Ҫ������˼����������߳���,���еĶ���������ͬһ��
//��ô��Щ�߳̾������첽����
//���������ͬ������
//ֻҪ���󲻱�,��ʹ��������Ա���
//���еĽ�����ǲ���ı�
//˵��synchronized��ʹ������
//Ϊʲô�Ҷ��ܿ�����Ҫȥ����Щ����ѽ
//��!!!,��������
//���ܾ�ֻ��֪������Ű�
//���ô����ܼ������
//���Կ�,���¶�ĥ,���õ�����û������
