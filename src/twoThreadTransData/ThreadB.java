package twoThreadTransData;

public class ThreadB extends Thread{
	private MyList list;

	public MyList getList() {
		return list;
	}

	public void setList(MyList list) {
		this.list = list;
	}

	public ThreadB(MyList list) {
		super();
		this.list = list;
	}
	@Override
	public void run() {
		try {
			while(true) {
				if(list.size() == 5) {
					System.out.println("==5了,线程B要退出了! ");
					throw new InterruptedException();
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
