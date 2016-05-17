import java.util.Scanner;

/*
 * 작성일: 2016-02-24
 * 작성자: 김소희
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
	
		System.out.println(총점을 더하는 부분total);
		System.out.printf("%5.2f", average);
		
		System.out.write('3' );
		System.out.flush(); 
		*/
		
		나갈래:
		while (true)
		{		
			System.out.println("");
			System.out.println("┐││││││││││││││┘");
			System.out.println("─         합을 구하는 프로그램    ─");
			System.out.println("┌││││││││││││││└");
			
			System.out.println("\t\t1. 갑 입력");
			System.out.println("\t\t2. 결과 보기");
			System.out.println("\t\t3. 도움말");
			System.out.println("\t\t4. 종료");
			System.out.println();
			System.out.println("\t\t선택 >");
			
			menu = scan.nextInt();
						
						stopswitch : switch(menu){
							case 1:
							{
								 while(true)
								{
										System.out.println("┐││││││││││││││┘");
										System.out.println("─                      값 입력              ─");
										System.out.println("┌││││││││││││││└");
						
										System.out.printf("시작값: ", i);
										i = scan.nextInt();
										System.out.printf("끝 값: ", j);
										j = scan.nextInt();
										
										
										stopSubwhile : while(true)										
										{
											System.out.println("상위 메뉴로 이동(yes=1/재입력=2)");
											yes = scan.nextInt();
											
											if(yes==1){
												break stopswitch;
											}							
											else if(yes==2){
												break stopSubwhile;
											}
											else{
												System.out.print("유효하지 않은 메시지입니다.");
											}
									}									
								}
							}
							case 2:
								{
									System.out.println("┐││││││││││││││┘");
									System.out.println("─                      결과 보기           ─");
									System.out.println("┌││││││││││││││└");										
									
									int sum = j*(j+1)/2 ;
									
									System.out.printf("[%d]부터 [%d]까지의 합은 [%d]입니다. ", i, j, sum);
									System.out.println();
									
									
									while(true)
									{
										System.out.printf("상위 메뉴로 이동(yes=1)");
										yes = scan.nextInt();
										
										if(yes ==1){
											break stopswitch;
										}
										else{
											System.out.print("유효하지 않은 메시지입니다.");
										}
									}
								}
			
							case 3:
								{
									System.out.println("┐││││││││││││││┘");
									System.out.println("─                         도움말             ─");
									System.out.println("┌││││││││││││││└");
									
									System.out.println("그냥 쓰세요");
									
									while(true){			
									System.out.printf("상위 메뉴로 이동1(yes=1)");
									yes = scan.nextInt();
									
									if(yes==1)
										{
											break stopswitch;
										}
									else{
										System.out.print("유효하지 않은 메시지입니다.");
											}
									}	
								}
			
							case 4:
								{
									System.out.println("\t\t\t\tBye");
									// System.exit(0);
								}
								break 나갈래;
								
							default:
								{
									System.out.println("안돼. 돌아가.");
								}
								scan.close();
						}
		}
	}
}