package sameNum;

public class MyThread extends Thread{
	private int i = 5;
	@Override
	public void run() {
		System.out.println("i = " + i-- + " threadNam = " + Thread.currentThread().getName());
		//ע��,����i--��ǰ����Ŀ�е���һ�����иĳ��ڵ�ǰ��Ŀ����println()������ֱ�Ӵ�ӡ
	}
	//��Ȼprintln()�������ڲ���ͬ����,��i--�Ĳ���ȴ���ڽ���Println()֮ǰ������,�����з������̰߳�ȫ����ĸ���
}
