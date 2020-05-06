package service;

public class Service {
	synchronized public static void printA() throws InterruptedException{
		System.out.println(
				"�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + "����printA");
		Thread.sleep(3000);
		System.out.println(
				"�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + "�뿪printA");
	}

	synchronized public static void printB() {
		System.out.println(
				"�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + "����printB");
		System.out.println(
				"�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + "�뿪printB");
	}

	synchronized public void printC() {
		System.out.println(
				"�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + "����printC");
		System.out.println(
				"�߳�����Ϊ: " + Thread.currentThread().getName() + " �� " + System.currentTimeMillis() + "�뿪printC");
	}
}
