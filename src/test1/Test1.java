package test1;

public class Test1 {
	public static void main(String[] args) {
		//�����쳣��ԭ����û�ж����������Ҳ����û��ͬ������
		try {
			String newString = new String("");
			newString.wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
