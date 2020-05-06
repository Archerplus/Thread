package dispatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
	static char a, b, c, d; // ���ܺţ��кţ��кţ�����

	public static void main(String[] args) {
		int info[] = new int[3];
		info[0] = 1121;
		info[1] = 2122;
		info[2] = 3113;
		String[] str = new String[3];
		for (int i = 0; i < 3; i++) {
			str[i] = info[i] + "";
			a = str[i].charAt(0);
			b = str[i].charAt(1);
			c = str[i].charAt(2);
			d = str[i].charAt(3);
		}
		ThreadCar tc = new ThreadCar();
		ThreadShelf ts = new ThreadShelf();
		tc.start();
		ts.start();
	}

	// ��С����ͨ��
	static class ThreadCar extends Thread {
		public void toRun() {
			int port = 13777;

			ServerSocket server = null;
			ExecutorService service = Executors.newFixedThreadPool(50);

			try {
				server = new ServerSocket(port);
				System.out.println("ThreadCar server has started!");
				Socket socket = server.accept();
				service.execute(new Handler(socket));
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (server != null) {
					try {
						server.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				server = null;
			}
		}

		class Handler implements Runnable {
			Socket socket = null;

			public Handler(Socket socket) {
				this.socket = socket;
			}

			@Override
			public void run() {
				BufferedReader reader = null;
				PrintWriter writer = null;
				try {
					// ���û����������
					InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
					reader = new BufferedReader(inputStreamReader);
					// ������ݸ��׽��ֵ���һ��
					OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
					writer = new PrintWriter(outputStreamWriter);
					String readMessage = null;

					while (true) {
						System.out.println("server reading... ");
						if ((readMessage = reader.readLine()) == null) {
							break;
						}
						System.out.println(readMessage);
						writer.println("server recive : " + readMessage);
						writer.flush();
					}
					//�߼�����
					while (true) {
						// ���ͻ��ܺź��к�
						writer.println();
						Thread.currentThread().wait();
						// ת�����ܷ��͹����ĺ�����Ϣ
						writer.println(readMessage);
						writer.flush();
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (socket != null) {
						try {
							socket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					socket = null;
					if (reader != null) {
						try {
							reader.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					reader = null;
					if (writer != null) {
						writer.close();
					}
					writer = null;
				}
			}
		}
	}

	// ����ܵ�ͨ��
	static class ThreadShelf extends Thread {
		static int flag = 0;

		public void toRun() {
			int port = 13666;

			ServerSocket server = null;
			ExecutorService service = Executors.newFixedThreadPool(50);

			try {
				server = new ServerSocket(port);
				System.out.println("server started!");
				while (true) {
					Socket socket = server.accept();
					service.execute(new Handler(socket));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (server != null) {
					try {
						server.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				server = null;
			}
		}

		class Handler implements Runnable {
			Socket socket = null;

			public Handler(Socket socket) {
				this.socket = socket;
			}

			@Override
			public void run() {
				BufferedReader reader = null;
				PrintWriter writer = null;
				try {
					// ���û����������
					InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
					reader = new BufferedReader(inputStreamReader);
					// ������ݸ��׽��ֵ���һ��
					OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
					writer = new PrintWriter(outputStreamWriter);
					String readMessage = null;

//					while (true) {
//						System.out.println("server reading... ");
//						if ((readMessage = reader.readLine()) == null) {
//							break;
//						}
//						System.out.println(readMessage);
//						writer.println("server recive : " + readMessage);
//						writer.flush();
//					}
					while (true) {
						// ���ͻ��ܺź��кŸ���Ӧ�Ļ���
						writer.println();
						// ���պ�����Ϣ�����͸�С��
						// ���͸û����û�����Ҫ����Ʒ��Ϣ
						// ���ܷ��ͻ���ȷ����Ϣ
						// ���ܷ�����Ʒ�Ѿ�������Ϣ
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (socket != null) {
						try {
							socket.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					socket = null;
					if (reader != null) {
						try {
							reader.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					reader = null;
					if (writer != null) {
						writer.close();
					}
					writer = null;
				}
			}
		}
	}
}
