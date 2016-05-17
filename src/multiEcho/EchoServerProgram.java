package multiEcho;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServerProgram {

	public static void main(String[] args) throws IOException {
		boolean isRun = true;

		//�⺻ ���� ����
		ServerSocket svrSocket = new ServerSocket(10000);
		System.out.println("listenning");

		//Ŭ���̾�Ʈ�� ���� ���� ����
		while(isRun){
			
			Socket socket = svrSocket.accept();
			System.out.println("connected from " + socket.getRemoteSocketAddress());

			//���ο� ������
			new Thread(new Runnable() {

				@Override
				public void run() {

					try {
						OutputStream nos = socket.getOutputStream();
						InputStream nis = socket.getInputStream();

						PrintStream nout = new PrintStream(nos, true);
						Scanner nscan = new Scanner(nis);

						String msg;

						do{
							msg = nscan.nextLine();
							System.out.println(msg);

							nout.println("echo : "+msg);

						} while(!msg.equals("bye"));

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


			//���ڸ� �޴´�
			/*ServerSocket svrSocket = new ServerSocket(10000);
		System.out.println("listenning");

		Socket socket = svrSocket.accept();
		System.out.println("connected from " + socket.getRemoteSocketAddress());

		OutputStream nos = socket.getOutputStream();
		InputStream nis = socket.getInputStream();

		PrintStream nout = new PrintStream(nos, true);
		Scanner nscan = new Scanner(nis);

		String msg = nscan.nextLine();
		System.out.println(msg);

		System.out.println("echo :"+msg);*/


			//������ �޴´�
			/*Socket socket = svrSocket.accept();
		System.out.println("connected from " + socket.getRemoteSocketAddress());

		InputStream nin = socket.getInputStream();
		OutputStream nout = socket.getOutputStream();

		FileOutputStream fout = new FileOutputStream("C:\\Users\\SS\\Desktop\\Program1.jpg");

		for(int c = nin.read(); c != -1; c = nin.read()){
			fout.write(c);
		}

		fout.flush();
		fout.close();
		nin.close();
		nout.close();
		socket.close();

		System.out.println("���۵� ������ ����Ǿ����ϴ�.");*/

			/*char c = (char) nin.read();
		System.out.println(c);*/

		}
	}
}
