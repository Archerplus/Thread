package synLockIn_1;

public class Service {
	synchronized public void service1() {
		System.out.println("service1");
		service2();
	}
	synchronized public void service2() {
		System.out.println("service2");
		service3();
	}
	synchronized public void service3() {
		System.out.println("service3");
	}
}


//�ؼ���synchronizedӵ��������Ĺ���,Ҳ������ʹ��synchronizedʱ,
//��һ���̵߳õ�һ��������֮��,�ٴ�����˶�����ʱ�ǿ����ٴεõ��ö��������.
//��Ҳ֤����һ��synchronized������������ڲ����ñ��������synchronized����������ʱ
//�ǿ�����Զ�õ�����