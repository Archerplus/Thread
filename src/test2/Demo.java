package test2;

public class Demo extends Thread {
	public Demo() {
		//��ǰ�������е��̵߳�����
		System.out.println("Thread.currentThread().getname()=" + Thread.currentThread().getName());
		//���õ�ǰ���������
		System.out.println("This.getName=" + this.getName());
	}

	public void run() {
		System.out.println("Thread.currentThread().getname()=" + Thread.currentThread().getName());
		System.out.println("This.getName=" + this.getName());
	}

	public static void main(String[] args) {
		//thread��t1��������ͬ�Ķ���,Ψһ���ص����thread��Ϊһ������ֵ������t1��
		//������t1.start()������ʱ��
		//��Ϊthread��run������д��,
		//���Ե��õĻ���thread.run()����
		Demo thread = new Demo();
		thread.setName("Archer");
		Thread t1 = new Thread(thread);
		//�ı��ֻ��t1�����ֺ�threadû�й�ϵ
		t1.setName("A");
		t1.start();
//		Demo thread = new Demo();
//		thread.setName("Archer");
//		thread.start();
	}
}
class A implements Runnable{
	@Override
	public void run() {
		System.out.println();	
	}
}


