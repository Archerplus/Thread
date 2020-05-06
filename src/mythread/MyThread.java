package mythread;

import java.util.Random;

public class MyThread extends Thread {
	@Override
	public void run() {
		super.run();
		for(int i = 0;i < 10;i++) {
			int time = (int)(Math.random() * 1000);
			try {
				Thread.sleep(time);
				System.out.println("run=" + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
