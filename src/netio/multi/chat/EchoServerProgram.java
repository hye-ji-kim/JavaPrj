package netio.multi.chat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException {

		List<PrintStream> nouts = new ArrayList<>();
		
		ReadWriteLock readWriteLock=new ReentrantReadWriteLock();
				
		boolean isRun = true;

		// �⺻ ���� ����
		ServerSocket svrSocket = new ServerSocket(10000);
		System.out.println("listenning");

		// Ŭ���̾�Ʈ�� ���� ���� ����
		while (isRun) {

			Socket socket = svrSocket.accept(); // ����� ����
			System.out.println("connected from " + socket.getRemoteSocketAddress());

			// ���ο� ������
			new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						OutputStream nos = socket.getOutputStream();
						InputStream nis = socket.getInputStream();
						
						PrintStream nout = new PrintStream(nos, true);
						
						readWriteLock.writeLock().lock();
						nouts.add(nout);
						readWriteLock.writeLock().unlock();

						Scanner nscan = new Scanner(nis);

						String msg;

						do {
							msg = nscan.nextLine();
							
							System.out.println(msg);
							
							readWriteLock.readLock().lock();
							for(int i=0; i<nouts.size(); i++){

							nouts.get(i).println("echo : " + msg);
							}
							readWriteLock.readLock().unlock();

						} while (!msg.equals("bye"));

						nscan.close();
						nout.close();
						nis.close();
						nos.close();
						socket.close();

					} catch (IOException e) {

						e.printStackTrace();
					}
				}
			}).start();

		}
	}
}
