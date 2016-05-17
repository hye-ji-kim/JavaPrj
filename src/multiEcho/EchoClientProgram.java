package multiEcho;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClientProgram {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket socket = new Socket("211.238.142.160", 10000);
		System.out.println("connected to " + socket.getRemoteSocketAddress());


		OutputStream nos = socket.getOutputStream();
		InputStream nis = socket.getInputStream();

		PrintStream nout = new PrintStream(nos, true);
		Scanner nscan = new Scanner(nis);
		Scanner scan = new Scanner(System.in);

		String msg;

		do{
			msg = scan.nextLine();
			nout.println(msg);

			String echo = nscan.nextLine();
			System.out.println(echo);

		} while(!msg.equals("bye"));


		//���� ����
		/*Socket socket = new Socket("211.238.142.157", 10000);
	System.out.println("connected to " + socket.getRemoteSocketAddress());


	OutputStream nos = socket.getOutputStream();
	InputStream nis = socket.getInputStream();

	PrintStream nout = new PrintStream(nos, true);
	Scanner nscan = new Scanner(nis);

	nout.println("hello network");

	String msg = nscan.nextLine();
	System.out.println(msg);

	nout.close();
	nscan.close();

	nis.close();
	nos.close();
	socket.close();*/


		//���� ����
		/*Socket socket = new Socket("211.238.142.157", 10000);
	System.out.println("connected to " + socket.getRemoteSocketAddress());

	InputStream nin = socket.getInputStream();
	OutputStream nout = socket.getOutputStream();
	nout.write('h');
	nout.flush();

	InputStream fin = new FileInputStream("C:\\Users\\SS\\Desktop\\b.jpg");

	for(int c = fin.read(); c != -1; c = fin.read()){
		nout.write(c);
	}

	nout.flush();
	fin.close();

	nin.close();
	nout.close();
	socket.close();
	System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");	*/


		//����ó��
		/*try(Socket socket = new Socket("211.238.142.157", 10000)){
			socket.setSoTimeout(15000);
		}
			catch (IOException ex){
				System.out.println("���� ����");
			}*/
	}
}
