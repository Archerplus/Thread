package pipeInputOutput;

import java.io.PipedOutputStream;
//�ܵ�����һ����������������ڲ�ͬ�̼߳�ֱ�Ӵ������ݡ�
//һ���̷߳������ݵ�����ܵ�����һ���̴߳�����ܵ���ȡ����
//ͨ��ʹ�ùܵ���ʵ�ֲ�ͬ�̼߳��ͨ�ţ��������������������ʱ�ļ�֮��Ķ���
public class WriteData {
	public void writeMethod(PipedOutputStream out) {
		try {
			System.out.println("write: ");
			for(int i = 0;i < 300;i++) {
				String outData = "" + (i + 1);
				out.write(outData.getBytes());
				System.out.println(outData);
			}
			System.out.println();
			out.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
