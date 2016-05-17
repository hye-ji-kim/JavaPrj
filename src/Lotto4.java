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
		int current = -1; //������ ����
		
		���� : while(true){

			System.out.println();
			System.out.println("�ζ� ��ȣ �����~");
			System.out.println("1.  ��ȣ ���");
			System.out.println("2.  ��ȣ �б�");
			System.out.println("3.  ��ȣ ����");
			System.out.println("4.  ����");
			int menu = scan.nextInt();

			switch(menu)
			{
			case 1:
			{
				System.out.println("��ȣ ���~");
				
				������ : while(true)
				{
						int smenu = 0;
						for(int i=0;i<current+1;i++)
						{
							int[] lotto = lottos[i];
							System.out.printf("%d: %d %d %d %d %d %d \n", i+1, lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
							/*System.out.printf("%d: %d %d %d %d %d %d \n", i+1, lotto[i][0], lotto[i][1], lotto[i][2], lotto[i][3], lotto[i][4], lotto[i][5]);*/
						}
						System.out.println("��������������������������");
						System.out.println("1.  ��ȣ ����");
						System.out.println("2.  ��ȣ �Է�");
						System.out.println("3.  ���� �޴�");
						
						Random rand = new Random();
						int[] lotto = new int[6];
						//int bonus = 0;
						smenu =scan.nextInt();
						
						switch(smenu)
						{
							case 1:
							//�ߺ� �˻�
							for(int i=0; i<6; i++)
							{
								lotto[i] = rand.nextInt(45)+1;
								
								if(i>0) // i>0 �϶��� �ߺ��˻�
									{
									for( int j=0; j<i; j++)
										{
										if(lotto[i-j-1]==lotto[i])
											i -= 1;
										}
									}
							}
			
							//�����ϱ� �������� (ù��°�� �ι�° ���� �ٲ�)
							int temp; //���� ��ȯ�� �� �ִ� �ӽ� ��ó i<6�̸� 7��° ���� �ʿ�
							
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
							
							//lotto�� �ִ� ���� lottos�� �ű�� �۾�
							++current; // �������� �Է��� �������� ��ġ
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
	
							case 3: // while�� ����� ��
							break ������;	
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
						
						current++; // �޸𸮿� �ִ� �ε���. ������ �����ߴ�?
					}
					fis.close();
					System.out.println("������ �б� ��");
				
				break;
				
				case 3:
					
					FileOutputStream fos = new FileOutputStream("res/lottos.txt"); //��� ���
					fos.write(current+1); // ¤�� �Ѿ��
					for(int n=0;n<current+1;n++)
					{
						int[] lotto = lottos[n];
						for(int i=0;i<6;i++)
						fos.write(lotto[i]); 
					}
					fos.close(); 
					
					/*FileOutputStream fos = new FileOutputStream("res/lottos.txt"); //��� ���
					PrintStream fout = new PrintStream(fos);
					for(int i=0;i<current+1;i++)
					{
						int[] lotto = lottos[i];
						fout.printf("%d %d %d %d %d %d \r\n",lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]); //\r ó������ ���ư�
					}
					fout.close();
					fos.close(); */
				break;

				case 4:
				break ����;
			}
		}
	}
}