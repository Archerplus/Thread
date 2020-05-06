package pipeReaderWrite;

import java.io.PipedReader;
import java.io.PipedWriter;

public class Run {
	public static void main(String[] args) {
		try {
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			
			PipedReader inputStream = new PipedReader();
			PipedWriter outputStream = new PipedWriter();

			outputStream.connect(inputStream);
			
			ThreadRead threadRead = new ThreadRead(readData, inputStream);
			threadRead.start();
			
			Thread.sleep(2000);
			
			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
