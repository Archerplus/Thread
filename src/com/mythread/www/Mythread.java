package com.mythread.www;

public class Mythread extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
}
