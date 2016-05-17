package oop.inhe.c;

import java.util.Scanner;


//onPrint(��ǰ)�� abstract ������ ExamConsole(��)�� abstract�� �ٲ���
public class ExamConsole {
	
	private Exam exam;
	//�����ϰ� PrintListener�� �������̽� ����
	private PrintListener printListener;
	
	
	
	
	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}

	//�⺻ ������
	public ExamConsole() {
		
	}
	
	public ExamConsole (Exam exam)
	{
		this.exam = exam;
	}
	
	
		
      public Exam getExam() {
		return exam;
	}



	public void setExam(Exam exam) {
		this.exam = exam;
	}



	public void input(){  // �Է�

      Scanner scan = new Scanner(System.in);

      int kor = 0;
      int eng = 0;
      int math = 0; // �ӽ� ����� ����

      System.out.println("������������������");
      System.out.println("��     �����Է�     ��");
      System.out.println("������������������");
      // ���� ��ȿ�� �˻�
      do {
         System.out.print("���� : ");
         kor = scan.nextInt();

         if (!(0 <= kor && kor <= 100))
            System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100). �ٽ��Է��� �ּ���.");

      } while (!(0 <= kor && kor <= 100));

      do {
         System.out.print("���� : ");
         eng = scan.nextInt();

         if (!(0 <= eng && eng <= 100))
            System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100). �ٽ��Է��� �ּ���.");

      } while (!(0 <= eng && eng <= 100));

      do {
         System.out.print("���� : ");
         math = scan.nextInt();

         if (!(0 <= math && math <= 100))
            System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100). �ٽ��Է��� �ּ���.");

      } while (!(0 <= math && math <= 100));
      
      
      exam.setKor(kor);      
      exam.setEng(eng);
      exam.setMath(math);

   }

   public void print() {

      int kor = exam.getKor();
      int eng = exam.getEng();
      int math = exam.getMath();

      int total = exam.total();
      float avg =exam.avg();

      System.out.println("������������������");
      System.out.println("��     �������     ��");
      System.out.println("������������������");

      System.out.printf("���� :%d\n", kor);
      System.out.printf("���� :%d\n", eng);
      System.out.printf("���� :%d\n", math);
      
      //�ι�° ���
      //���ļ� ����ؾ� �� �κ��� ��ü�ϴ� ���(��ŷ), �������̽� ���
      if(printListener != null)
    	  printListener.onPrint();
      
      System.out.printf("���� :%d\n", exam.total());
      System.out.printf("��� :%.2f\n", exam.avg());
      System.out.println("����������������������������");
   }

   //abstract: �� �� �������ض�, �ڽ��� å������ ��(Ȯ��Ŭ���� ����)
   //ù��° ���
   //protected abstract void onPrint();

}