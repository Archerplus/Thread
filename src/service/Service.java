package service;

public class Service {
	synchronized public static void printA() throws InterruptedException{
		System.out.println(
				"线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "进入printA");
		Thread.sleep(3000);
		System.out.println(
				"线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "离开printA");
	}

	synchronized public static void printB() {
		System.out.println(
				"线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "进入printB");
		System.out.println(
				"线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "离开printB");
	}

	synchronized public void printC() {
		System.out.println(
				"线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "进入printC");
		System.out.println(
				"线程名称为: " + Thread.currentThread().getName() + " 在 " + System.currentTimeMillis() + "离开printC");
	}
}
