package com.mythread.www;

public class Run {
	public static void main(String[] args) {
		Mythread mythread1 = new Mythread();
		Mythread mythread2 = new Mythread();
		mythread1.start();
		mythread2.start();
		System.out.println("ÔËĞĞ½áÊø!");
	}
}
