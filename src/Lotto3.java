/*파일 입출력 코드 포함
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

		//파일 입출력으로 번호 받기
		for(int i=0; i<6; i++)
			{
			lotto[i] = fscan.nextInt();
			
			if(i>0) // i>0 일때만 중복검사
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

		//번호출력
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i] );
			System.out.println();

		//정렬하기 버블정렬 (첫번째와 두번째 공간 바꿈)
		int temp; //값을 교환할 수 있는 임시 거처 i<6이면 7번째 값이 필요
		
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
		
		//번호출력
		for(int i=0; i<6; i++)
		//	System.out.printf("%d ", lotto[i] );
			fos.printf("%d ", lotto[i] );
		
		fos.close();
		fout.close();
	}
//	System.out.println();
}