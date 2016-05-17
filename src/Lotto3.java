/*���� ����� �ڵ� ����
2016-03-04*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto3 {
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\20160223\\lotto.txt");
		Scanner fscan = new Scanner(fis);

		Random rand = new Random();
		int[] lotto = new int[6];
		//int bonus = 0;

		//���� ��������� ��ȣ �ޱ�
		for(int i=0; i<6; i++)
			{
			lotto[i] = fscan.nextInt();
			
			if(i>0) // i>0 �϶��� �ߺ��˻�
				{
				for( int j=0; j<i; j++)
					{
					if(lotto[i-j-1]==lotto[i])
						i -= 1;
					}
				}
			}
			
		fscan.close();
		fis.close();

		//��ȣ���
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i] );
			System.out.println();

		//�����ϱ� �������� (ù��°�� �ι�° ���� �ٲ�)
		int temp; //���� ��ȯ�� �� �ִ� �ӽ� ��ó i<6�̸� 7��° ���� �ʿ�
		
		for(int j=0;j<5;j++){
			for(int i=0;i<5-j;i++)
				if(lotto[i]>lotto[i+1]){
					temp =lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1]= temp;
				}
		}

		FileOutputStream fout = new FileOutputStream("C:\\20160223\\lotto.txt");
		PrintStream fos = new PrintStream(fout);
		
		//��ȣ���
		for(int i=0; i<6; i++)
		//	System.out.printf("%d ", lotto[i] );
			fos.printf("%d ", lotto[i] );
		
		fos.close();
		fout.close();
	}
//	System.out.println();
}