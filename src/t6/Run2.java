package t6;

public class Run2 {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		mythread.start();
		//MyThreadl�G�Ĺ��캯���Ǳ�main�̵߳��õ�,
		//��run�����Ǳ�����ΪThread-0���̵߳��õ�,run�������Զ����õķ���
	}
}
