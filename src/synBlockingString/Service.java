package synBlockingString;

public class Service {
	private String usernameParam;
	private String passwordParam;
	private String anyString = new String();
	public void setUsernamePassword(String username,String password) {
		try {
			synchronized (anyString) {
				System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + " ��������");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + " �뿪�����");
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

//����this�������һ�����ŵ�:�����һ�������кܶ��synchronized����,
//��ʱ��Ȼ��ʵ��ͬ��,�����յ�����,����Ӱ������Ч��;
//�����ʹ��ͬ�����������this����,��synchronized(��this)������еĳ�����ͬ���������첽��,
//����������thisͬ����������this��,��ɴ���������Ч��



//ʹ��"synchronized(��this����x)ͬ�������"��ʽ����ͬ������
//���������������ͬһ������
//�������ͬһ�����������
//���еĽ�������첽������,�ͻύ������