package calendar;

import java.util.Scanner;


public class mainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year = 2016;
		int month = 0;
		int day = 0;
		int menu = 0;

		System.out.println("��������");
		System.out.println("���޷¦�");
		System.out.println("��������");
		System.out.println("1. �� �Է�(2016�� �޷¸� ���)");
		System.out.println("2. ��, ��, �� �Է�");

		menu=sc.nextInt();

		switch(menu)
		{
		case 1:

			while(true){
				System.out.println("\n");
				System.out.println("���� �Է��ϼ��� : ");
				month=sc.nextInt();

				try{
					// �Է¹��� year�� month�� �Ű������� ��ü �� ������ ����
					CalendarPrint cal = new CalendarPrint(year, month, day);
					// System.out �ֿܼ� ���
					cal.printCal();

				}catch(Exception e){
					e.printStackTrace();
					break;
				}
			}
			
		case 2:
			while(true){
				System.out.println("\n");
				System.out.println("�⵵�� �Է��ϼ��� : ");
				year=sc.nextInt();
				System.out.println("���� �Է��ϼ��� : ");
				month=sc.nextInt();
				System.out.println("���� �Է��ϼ��� : ");
				day=sc.nextInt();

				try{
					// �Է¹��� year�� month�� �Ű������� ��ü �� ������ ����
					CalendarPrint cal = new CalendarPrint(year, month, day);
					
					cal.day = day;

					// System.out �ֿܼ� ���
					cal.printCal();

				}catch(Exception e){
					e.printStackTrace();
					break;
				}		
			}
		}
	}
}