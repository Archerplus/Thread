package pipeInputOutput;

import java.io.PipedOutputStream;
//管道流是一种特殊的流，用于在不同线程间直接传送数据。
//一个线程发送数据到输出管道，另一个线程从输入管道读取数据
//通过使用管道，实现不同线程间的通信，而无须借助于类似于临时文件之类的东西
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
