package threadLocal11;

public class Run {
	public static ThreadLocal t1 = new ThreadLocal();
	public static void main(String[] args) {
		if(t1.get() == null) {
			System.out.println("��δ�Ź�ֵ");
			t1.set("�ҵ�ֵ");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
	}
}
//��ͼ�е����н����������һ�ε���t1�����get()����ʱ���ص�ֵ��null
//ͨ������set()������ֵ��˳��ȡ��ֵ����ӡ�ڿ���̨�ϡ�
//��ThreadLocal������Ǳ����ڲ�ͬ�̼߳�ĸ�����
//Ҳ���ǲ�ͬ�߳�ӵ���Լ���ֵ����ͬ�߳��е�ֵ�ǿ��Է���ThreadLocal���н��б����
