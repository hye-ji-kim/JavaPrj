package capsule;

import java.util.Scanner;

public class Exam {// ����

   private int kor;
   private int eng;
   private int math;
   
   
   //���� ������ �ִ� exam�� ������ ������ exam ���� ���� kor�� �� �����a

   public static void setKor(Exam exam, int kor){
      exam.kor=kor;
   }
   public static int getKor(Exam exam, int kor){
      return exam.kor;
   }
   

   public static void setEng(Exam exam, int eng){
      exam.eng=eng;
   }
   public static int getEng(Exam exam, int eng){
      return exam.eng;
   }
   

   public static void setMath(Exam exam, int math){
      exam.math=math;
   }
   public static int getMath(Exam exam, int math){
      return exam.math;
   }
   
   
   
   
   public static void printExam(Exam exam) {

      int kor = exam.kor;
      int eng = exam.eng;
      int math = exam.math;

      int total = kor + eng + math;
      float avg = total / 3.0f;

      System.out.println("����������������������");
      System.out.println("��            �������     ��");
      System.out.println("����������������������");

      System.out.printf("���� :%d\n", kor);
      System.out.printf("���� :%d\n", eng);
      System.out.printf("���� :%d\n", math);
      System.out.printf("���� :%d\n", total);
      System.out.printf("��� :%.2f\n", avg);
      System.out.println("����������������������������");
   }

   private static void inputExam(Exam exam) {// �Է�

      Scanner scan = new Scanner(System.in);

      int kor=0;
      int eng=0;
      int math=0;   //�ӽ� ����� ����
      
      
      System.out.println("����������������������");
      System.out.println("��            �����Է�     ��");
      System.out.println("����������������������");
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

         if (!(0 <= exam.math && exam.math <= 100))
            System.out.println("���� ������ ������ϴ�. ��ȿ����(0~100). �ٽ��Է��� �ּ���.");

      } while (!(0 <= math && math <= 100));

}
}