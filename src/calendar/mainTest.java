package calendar;

import java.util.Scanner;


public class mainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = 2016;
		int month = 0;
		int day = 0;
		int menu = 0;

		System.out.println("┌──┐");
		System.out.println("│달력│");
		System.out.println("└──┘");
		System.out.println("1. 월 입력(2016년 달력만 출력)");
		System.out.println("2. 년, 월, 일 입력");

		menu=sc.nextInt();

		switch(menu)
		{
		case 1:

			while(true){
				System.out.println("\n");
				System.out.println("월을 입력하세요 : ");
				month=sc.nextInt();

				try{
					// 입력받은 year와 month를 매개변수로 객체 및 데이터 생성
					CalendarPrint cal = new CalendarPrint(year, month, day);
					// System.out 콘솔에 출력
					cal.printCal();

				}catch(Exception e){
					e.printStackTrace();
					break;
				}
			}
			
		case 2:
			while(true){
				System.out.println("\n");
				System.out.println("년도를 입력하세요 : ");
				year=sc.nextInt();
				System.out.println("월을 입력하세요 : ");
				month=sc.nextInt();
				System.out.println("일을 입력하세요 : ");
				day=sc.nextInt();

				try{
					// 입력받은 year와 month를 매개변수로 객체 및 데이터 생성
					CalendarPrint cal = new CalendarPrint(year, month, day);
					
					cal.day = day;

					// System.out 콘솔에 출력
					cal.printCal();

				}catch(Exception e){
					e.printStackTrace();
					break;
				}		
			}
		}
	}
}