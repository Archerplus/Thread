package test;

//������Ϊ�˼���̵߳��õ������
//������Ϊ�����̵߳ĵ���Ӧ�����ڳ����ʼ��ʱ���ж�main���������Ƿ񴴽������̣߳�
//Ȼ����ȥ������Щ���̵߳�run����
//�����̵߳��Ⱥ����˳���������
//ȡ�����CPU��Դ����ռ
public class doThreadMethod {
	public static void main(String[] args) {
		new A().start();
		System.out.println("I ");
		System.out.println("am ");
		new B().start();
		System.out.println("hello ");
		new C().start();
		System.out.println("world");
	}
}

class A extends Thread {
	@Override
	public void run() {
		System.out.println("a");
		this.getName();
		Thread.currentThread().getName();
	}
}

class B extends Thread {
	@Override
	public void run() {
		System.out.println("b");
	}
}

class C extends Thread {
	@Override
	public void run() {
		System.out.println("c");
	}
}
