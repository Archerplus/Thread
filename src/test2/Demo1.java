package test2;

public class Demo1 {
	public static void main(String[] args) {
		Thread thread = new Thread();
//		Thread.currentThread().interrupt();
		thread.interrupt();
		System.out.println("��ǰ�߳��Ƿ��Ѿ�ֹͣ" 
	+ thread.interrupted());
		System.out.println("��ǰ�߳��Ƿ��Ѿ�ֹͣ" + thread.interrupted());
		
	}
}

//�жϵ�ǰ�߳��Ƿ��Ѿ�ֹͣ
//interrupted() ��̬����
//������ж�״̬
//isInterrupted() ���Ǿ�̬����
//��������ж�״̬