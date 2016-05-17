package capsule;

import java.util.Scanner;

public class Exam {// 정의

   private int kor;
   private int eng;
   private int math;
   
   
   //내가 가지고 있는 exam의 구조를 못보니 exam 에서 제발 kor값 좀 꺼내줭

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

      System.out.println("┐│││││││││┘");
      System.out.println("─            성적출력     ─");
      System.out.println("┌│││││││││└");

      System.out.printf("국어 :%d\n", kor);
      System.out.printf("영어 :%d\n", eng);
      System.out.printf("수학 :%d\n", math);
      System.out.printf("총점 :%d\n", total);
      System.out.printf("평균 :%.2f\n", avg);
      System.out.println("││││││││││││││");
   }

   private static void inputExam(Exam exam) {// 입력

      Scanner scan = new Scanner(System.in);

      int kor=0;
      int eng=0;
      int math=0;   //임시 저장소 설정
      
      
      System.out.println("┐│││││││││┘");
      System.out.println("─            성적입력     ─");
      System.out.println("┌│││││││││└");
      // 성적 유효성 검사
      do {
         System.out.print("국어 : ");
         kor = scan.nextInt();

         if (!(0 <= kor && kor <= 100))
            System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100). 다시입력해 주세요.");

      } while (!(0 <= kor && kor <= 100));

      do {
         System.out.print("영어 : ");
         eng = scan.nextInt();

         if (!(0 <= eng && eng <= 100))
            System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100). 다시입력해 주세요.");

      } while (!(0 <= eng && eng <= 100));

      do {
         System.out.print("수학 : ");
         math = scan.nextInt();

         if (!(0 <= exam.math && exam.math <= 100))
            System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100). 다시입력해 주세요.");

      } while (!(0 <= math && math <= 100));

}
}