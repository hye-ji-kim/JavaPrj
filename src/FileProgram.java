import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		//��ġ��
		System.out.println("Beautiful"+" Flowers");
		System.out.println("Beautiful".concat(" Flowers"));
		
		//������
		String[] strs = "�ζ� : 1 20 30".split(" : "); //split�� new ������(�迭 �������) ������ �ȶ���...
		System.out.println(strs[0]);
		System.out.println(strs[1]);
		
		//�ڸ���
		"Hello".substring(2);
		
		//��ü�� ������ ��
		String name1 = "a";
		String name2 = "a"; //������ ���� ������? ���� ��ü�� �����ϰ� ��
		String name3 = new String("a"); // ���� ������ ���ο� ��ü�� ���ϴ� ��
		
		//���� ���� ��
		System.out.println(name1==name2);
		System.out.println(name1.equals(name3));
		
		//���ڿ� ã��
		"Hello".indexOf("a");//a�� ���Ե� ��ġ �ε���
		System.out.println("Hello".indexOf("a"));

		// o�� ��ġ�� ã����
		int idx = "Hello How are you".indexOf("o");
		System.out.println(idx);
		
		idx = "Hello How are you".indexOf("o", idx+1);
		System.out.println(idx);
		
		idx = "Hello How are you".indexOf("o", idx+1);
		System.out.println(idx);
		
		String filename = "file1.txt";
		idx= ("file1.txt".lastIndexOf(".")); // .���� ���� ����
		System.out.println(filename.substring(idx+1));
		
		String path ="C:\\20160223\\lotto.txt";
		idx= (path.lastIndexOf("\\"));
		System.out.println(path.substring(idx+1));
		
		//���ڿ� ��ȯ: ���� <-> ���ڿ�
		int kor = Integer.parseInt("23");
		System.out.println(kor +2);
		
		String s =""+kor;
		//String s = String.valueOf(kor);
		System.out.println( s +"2");*/
		
		
		FileOutputStream fos = new FileOutputStream("C:\\20160223\\Hello.txt");
		PrintStream fout = new PrintStream(fos);
		fout.print("I can do it!");
		
		fout.close(); // ������ ������ �ݴ��
		fos.close(); // �Ϻ� �ڿ��� ���� �͵��� ��ȯ�ؾ� �� �� close ���
		
		System.out.println("�Է� �޾� �����?");
		
		FileInputStream fis = new FileInputStream("C:\\20160223\\Lotto.txt");
		Scanner fscan = new Scanner(fis);
		
		//���� ���ڿ����� �ϳ��� �о���� (�����̽��� ����)
		fscan.next();
		fscan.next();
		int n1 = fscan.nextInt();
		int n2 = fscan.nextInt();
		int n3 = fscan.nextInt();	
		//String str = fscan.nextLine(); ���ڿ��� �о�´�.
		
		//���
		System.out.printf("n1: %d, n2: %d, n3:%d", n1, n2, n3);
		
		fscan.close();
		fis.close();
	}
}
