import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Lotto4 {
	
	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[][] lottos = new int[10][6];
		int current = -1; //데이터 없음
		
		꺼져 : while(true){

			System.out.println();
			System.out.println("로또 번호 따라란~");
			System.out.println("1.  번호 목록");
			System.out.println("2.  번호 읽기");
			System.out.println("3.  번호 저장");
			System.out.println("4.  종료");
			int menu = scan.nextInt();

			switch(menu)
			{
			case 1:
			{
				System.out.println("번호 목록~");
				
				나갈래 : while(true)
				{
						int smenu = 0;
						for(int i=0;i<current+1;i++)
						{
							int[] lotto = lottos[i];
							System.out.printf("%d: %d %d %d %d %d %d \n", i+1, lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
							/*System.out.printf("%d: %d %d %d %d %d %d \n", i+1, lotto[i][0], lotto[i][1], lotto[i][2], lotto[i][3], lotto[i][4], lotto[i][5]);*/
						}
						System.out.println("│││││││││││││");
						System.out.println("1.  번호 생성");
						System.out.println("2.  번호 입력");
						System.out.println("3.  상위 메뉴");
						
						Random rand = new Random();
						int[] lotto = new int[6];
						//int bonus = 0;
						smenu =scan.nextInt();
						
						switch(smenu)
						{
							case 1:
							//중복 검사
							for(int i=0; i<6; i++)
							{
								lotto[i] = rand.nextInt(45)+1;
								
								if(i>0) // i>0 일때만 중복검사
									{
									for( int j=0; j<i; j++)
										{
										if(lotto[i-j-1]==lotto[i])
											i -= 1;
										}
									}
							}
			
							//정렬하기 버블정렬 (첫번째와 두번째 공간 바꿈)
							int temp; //값을 교환할 수 있는 임시 거처 i<6이면 7번째 값이 필요
							
							for(int j=0;j<5;j++)
								{
								for(int i=0;i<5-j;i++)
									if(lotto[i]>lotto[i+1])
									{
										temp =lotto[i];
										lotto[i] = lotto[i+1];
										lotto[i+1]= temp;
									}
								}
							
							//lotto에 있는 값을 lottos로 옮기는 작업
							++current; // 마지막에 입력한 데이터의 위치
							for(int i=0;i<6;i++)
							{
								lottos[current][i] = lotto[i];
							}
							
							for(int i=0;i<6;i++)
							{
								System.out.printf("%d ", lottos[current][i] );		
							}
							break;
							
							case 2:
							break;
	
							case 3: // while을 벗어나야 함
							break 나갈래;	
						}
				}
			} // while
				break;
			
				case 2:
					FileInputStream fis = new FileInputStream("res/lottos.txt"); 
					int count = fis.read();
					current = -1;
					
					for(int n=0; n<count; n++)
					{
						int[] lotto = lottos[n];
												
						for(int i=0;i<6;i++)
							lotto[i]= fis.read();
						
						current++; // 메모리에 있는 인덱스. 어디까지 저장했니?
					}
					fis.close();
					System.out.println("데이터 읽기 끝");
				
				break;
				
				case 3:
					
					FileOutputStream fos = new FileOutputStream("res/lottos.txt"); //상대 경로
					fos.write(current+1); // 짚고 넘어가기
					for(int n=0;n<current+1;n++)
					{
						int[] lotto = lottos[n];
						for(int i=0;i<6;i++)
						fos.write(lotto[i]); 
					}
					fos.close(); 
					
					/*FileOutputStream fos = new FileOutputStream("res/lottos.txt"); //상대 경로
					PrintStream fout = new PrintStream(fos);
					for(int i=0;i<current+1;i++)
					{
						int[] lotto = lottos[i];
						fout.printf("%d %d %d %d %d %d \r\n",lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]); //\r 처음으로 돌아감
					}
					fout.close();
					fos.close(); */
				break;

				case 4:
				break 꺼져;
			}
		}
	}
}