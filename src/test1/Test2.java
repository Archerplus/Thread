package test1;

public class Test2 {
	public static void main(String[] args) {
		try {
			String lock = new String();
			System.out.println("syn����");
			synchronized (lock) {
				System.out.println("syn��һ��");
				lock.wait();
				System.out.println("wait����Ĵ���");
			}
			System.out.println("syn����Ĵ���");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}