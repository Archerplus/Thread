package twoThreadTransData;

public class ThreadA extends Thread{
	private MyList list;
	@Override
	public void run() {
		for(int i = 0;i < 10;i++) {
			list.add();
			System.out.println("�����" + (i + 1) + "��Ԫ��");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	public MyList getList() {
		return list;
	}
	public void setList(MyList list) {
		this.list = list;
	}
	public ThreadA(MyList list) {
		super();
		this.list = list;
	}
}
