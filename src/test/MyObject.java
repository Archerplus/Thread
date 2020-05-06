package test;

public class MyObject {
	private int i = 1;
    public void methodA() {
//        System.out.println("执行方法A");
        System.out.println("i = " + i++);
    }

    public void methodB() {
//    	System.out.println("执行方法B");
        System.out.println("i = " + i);
    }
}