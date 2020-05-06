package two_object_two_lock;

/**
 * className HasSelfPrivateNum
 * description
 *
 * @author feng
 * @version 1.0
 * @date 2019/1/12 ����11:46
 */
public class HasSelfPrivateNum {
    private int num = 0;

    /**
     * �������synchronized ������ ʵ���������̰߳�ȫ������̹߳�ͬ����num�����µ����ݴ���
     * @param username
     */
    public synchronized void addI(String username) {
        try {
            if ("a".equals(username)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(1600);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(username + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}