import java.util.Scanner;

/*
 * �ۼ���: 2016-02-24
 * �ۼ���: �����
 */
public class TestProgram {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		int j = 0;
		int yes =0;
		
		int menu;
		
		/* kor = 80;
		eng = 70;
		math = 70;
	
		System.out.println(������ ���ϴ� �κ�total);
		System.out.printf("%5.2f", average);
		
		System.out.write('3' );
		System.out.flush(); 
		*/
		
		������:
		while (true)
		{		
			System.out.println("");
			System.out.println("��������������������������������");
			System.out.println("��         ���� ���ϴ� ���α׷�    ��");
			System.out.println("��������������������������������");
			
			System.out.println("\t\t1. �� �Է�");
			System.out.println("\t\t2. ��� ����");
			System.out.println("\t\t3. ����");
			System.out.println("\t\t4. ����");
			System.out.println();
			System.out.println("\t\t���� >");
			
			menu = scan.nextInt();
						
						stopswitch : switch(menu){
							case 1:
							{
								 while(true)
								{
										System.out.println("��������������������������������");
										System.out.println("��                      �� �Է�              ��");
										System.out.println("��������������������������������");
						
										System.out.printf("���۰�: ", i);
										i = scan.nextInt();
										System.out.printf("�� ��: ", j);
										j = scan.nextInt();
										
										
										stopSubwhile : while(true)										
										{
											System.out.println("���� �޴��� �̵�(yes=1/���Է�=2)");
											yes = scan.nextInt();
											
											if(yes==1){
												break stopswitch;
											}							
											else if(yes==2){
												break stopSubwhile;
											}
											else{
												System.out.print("��ȿ���� ���� �޽����Դϴ�.");
											}
									}									
								}
							}
							case 2:
								{
									System.out.println("��������������������������������");
									System.out.println("��                      ��� ����           ��");
									System.out.println("��������������������������������");										
									
									int sum = j*(j+1)/2 ;
									
									System.out.printf("[%d]���� [%d]������ ���� [%d]�Դϴ�. ", i, j, sum);
									System.out.println();
									
									
									while(true)
									{
										System.out.printf("���� �޴��� �̵�(yes=1)");
										yes = scan.nextInt();
										
										if(yes ==1){
											break stopswitch;
										}
										else{
											System.out.print("��ȿ���� ���� �޽����Դϴ�.");
										}
									}
								}
			
							case 3:
								{
									System.out.println("��������������������������������");
									System.out.println("��                         ����             ��");
									System.out.println("��������������������������������");
									
									System.out.println("�׳� ������");
									
									while(true){			
									System.out.printf("���� �޴��� �̵�1(yes=1)");
									yes = scan.nextInt();
									
									if(yes==1)
										{
											break stopswitch;
										}
									else{
										System.out.print("��ȿ���� ���� �޽����Դϴ�.");
											}
									}	
								}
			
							case 4:
								{
									System.out.println("\t\t\t\tBye");
									// System.exit(0);
								}
								break ������;
								
							default:
								{
									System.out.println("�ȵ�. ���ư�.");
								}
								scan.close();
						}
		}
	}
}