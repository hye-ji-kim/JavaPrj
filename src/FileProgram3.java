import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("res/img/photo1.bmp"); 
		FileOutputStream fos = new FileOutputStream("res/img/photo-copy.bmp");

		fis.read();
		fis.read();
		
		byte[] buf = new byte[4];
		
		buf[0] =(byte)fis.read(); //int�� byte�� ����
		buf[1] =(byte)fis.read();
		buf[2] =(byte)fis.read();
		buf[3] =(byte)fis.read();
		
		int totalSize = ((int)buf[3]) << 24 | ((int)buf[2]) << 16 | ((int)buf[1]) << 8 | ((int)buf[0]) << 0;
		System.out.println(totalSize); // byte�� ���� ���� int�� ��ȯ�ϰ� Shift ������ �̿���
		//�տ� �ִ� �� �ڸ��� ���� ä������ -> �׸��� ����

		fos.close();
		fis.close();
	}
}
