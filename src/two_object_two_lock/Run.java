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
        //������������������Ҳ����˵��������������
        ThreadA aThread = new ThreadA(numRef1);
        ThreadB bThread = new ThreadB(numRef2);
        aThread.start();
        bThread.start();
    }
}


//�ؼ���synchronizedȡ�õ������Ƕ�����,�����ǰ�һ�δ���򷽷�(����)������
//�����������ʾ����,�Ǹ��߳���ִ�д�synchronized�ؼ��ֵķ���,
//�Ǹ��߳̾ͳ��и÷��������������lock,��ô�����߳̾�ֻ�ܳʵȴ�״̬
//ǰ���Ƕ���̷߳��ʵ���ͬһ������
//�������̷߳��ʶ������,��JVM�ͻᴴ�������
//ͬ��synchronized,�첽asynchronized