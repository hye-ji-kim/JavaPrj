import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("res/img/photo.bmp"); 
		FileOutputStream fos = new FileOutputStream("res/img/photo-copy.bmp");

		fis.read();
		fis.read();
		
		byte[] buf = new byte[4];
		
		buf[0] =(byte)fis.read(); //int�� byte�� ����
		buf[1] =(byte)fis.read();
		buf[2] =(byte)fis.read();
		buf[3] =(byte)fis.read();
		
		int totalSize = ((int)buf[3]& 0x000000ff) << 24 | ((int)buf[2] & 0xff) << 16 | ((int)buf[1]& 0xff) << 8 | ((int)buf[0]& 0xff) << 0;
		System.out.println(totalSize); // byte�� ���� ���� int�� ��ȯ�ϰ� Shift ������ �̿���
		//�տ� �ִ� �� �ڸ��� ���� ä������ -> �׸��� ����
		// & 0xff�� �����ؼ� 0���� ġ���� �׸��� ġ�� �ڸ��� Shift!
		
		/*0
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		fis.read();
		
		byte[] buf = new byte[4];
		
		buf[0] =(byte)fis.read();
		buf[1] =(byte)fis.read();
		buf[2] =(byte)fis.read();
		buf[3] =(byte)fis.read();
		
		int imageHeight = ((int)buf[3]) << 24 | ((int)buf[2]) << 16 | ((int)buf[1]) << 8 | ((int)buf[0]) << 0;
		System.out.println(imageHeight);*/
		
		/*
		byte[] buf = new byte[1024];
		int size;
		while((size=fis.read(buf)) != -1)
				fos.write(buf, 0, size);
				*/
		/*
		while(true)
		{
			int size = fis.read(buf);
			if(size==-1)
			break;
			else
				fos.write(size);
		}
		*/
		
		/*
		while(true)
		{
			int n = fis.read();
			if(n==-1)
			break;
			else
				fos.write(n);
		}
*/
		fos.close();
		fis.close();
	}
}
