package test;
//package dispatch;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class ThreadCar extends Thread {
//	public void toRun() {
//		int port = 13777;
//
//		ServerSocket server = null;
//		ExecutorService service = Executors.newFixedThreadPool(50);
//
//		try {
//			server = new ServerSocket(port);
//			System.out.println("server started!");
//			Socket socket = server.accept();
//			service.execute(new Handler(socket));
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (server != null) {
//				try {
//					server.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//			server = null;
//		}
//	}
//
//	static class Handler implements Runnable {
//		Socket socket = null;
//
//		public Handler(Socket socket) {
//			this.socket = socket;
//		}
//
//		@Override
//		public void run() {
//			BufferedReader reader = null;
//			PrintWriter writer = null;
//			try {
//				// 读用户输入的数据
//				InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
//				reader = new BufferedReader(inputStreamReader);
//				// 输出数据给套接字的另一端
//				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
//				writer = new PrintWriter(outputStreamWriter);
//				String readMessage = null;
//
//				while (true) {
//					System.out.println("server reading... ");
//					if ((readMessage = reader.readLine()) == null) {
//						break;
//					}
//					System.out.println(readMessage);
//					writer.println("server recive : " + readMessage);
//					writer.flush();
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				if (socket != null) {
//					try {
//						socket.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//				socket = null;
//				if (reader != null) {
//					try {
//						reader.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//				reader = null;
//				if (writer != null) {
//					writer.close();
//				}
//				writer = null;
//			}
//		}
//	}
//}
