package two_object_two_lock;

/**
 * className Run
 * description
 *
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum numRef1 = new HasSelfPrivateNum();
        HasSelfPrivateNum numRef2 = new HasSelfPrivateNum();
        //多个对象会产生多个锁，也就是说，两个互不干扰
        ThreadA aThread = new ThreadA(numRef1);
        ThreadB bThread = new ThreadB(numRef2);
        aThread.start();
        bThread.start();
    }
}


//关键字synchronized取得的锁都是对象锁,而不是把一段代码或方法(函数)当作锁
//所以在上面的示例中,那个线程先执行带synchronized关键字的方法,
//那个线程就持有该方法所属对象的锁lock,那么其他线程就只能呈等待状态
//前提是多个线程访问的是同一个对象
//如果多个线程访问多个对象,则JVM就会创建多个锁
//同步synchronized,异步asynchronized