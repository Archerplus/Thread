package joinMoreTest;

public class Run1 {
	public static void main(String[] args) {
		try {
			ThreadB b = new ThreadB();
			ThreadA a = new ThreadA(b);
			a.start();
			b.start();
//			b.join(2000);
			//���Է���һ������:main end �������ǵ�һ����ӡ��
			//���Կ�����ȫȷ���صó�һ������:����join�󲿷��������е�
			//Ҳ����������ThreadB����,Ȼ������ͷ�
			System.out.println("   main end " + System.currentTimeMillis());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
