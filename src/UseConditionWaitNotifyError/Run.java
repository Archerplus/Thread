package UseConditionWaitNotifyError;

public class Run {
	public static void main(String[] args) {
		MyService service = new MyService();
		ThreadA a = new ThreadA(service);
		a.start();
	}
}
//������쳣��Ϣ�Ǽ�������������İ취�Ǳ�����condition.await()��������֮ǰ����lock.lock()������ͬ��������