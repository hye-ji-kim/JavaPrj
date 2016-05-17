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

		// 기본 서버 소켓
		ServerSocket svrSocket = new ServerSocket(10000);
		System.out.println("listenning");

		// 클라이언트를 위한 서버 소켓
		while (isRun) {

			Socket socket = svrSocket.accept(); // 사용자 접속
			System.out.println("connected from " + socket.getRemoteSocketAddress());

			// 새로운 스레드
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
