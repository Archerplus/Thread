package suspend_resume_LockStop;

public class MyThread extends Thread{
	private long i = 0;
	@Override
	public void run() {
		while(true) {
			i++;
			//���������е�println()�����ڲ�ֹͣʱ,ͬ����δ���ͷ�
			//���µ�ǰprintStream�����println()����һֱ������ͣ״̬,
			//������δ���ͷ�,��main�����еĴ���System.out.println("main end");�ٳٲ��ܴ�ӡ
			System.out.println("i = " + i);
		}
	}
	public long getI() {
		return i;
	}
	public void setI(long i) {
		this.i = i;
	}
}
