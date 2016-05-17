package oop.inhe.c;

import java.util.Scanner;


//onPrint(부품)가 abstract 됐으니 ExamConsole(몸)도 abstract로 바꿔줌
public class ExamConsole {
	
	private Exam exam;
	//선언하고 PrintListener의 인터페이스 생성
	private PrintListener printListener;
	
	
	
	
	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}

	//기본 생성자
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



	public void input(){  // 입력

      Scanner scan = new Scanner(System.in);

      int kor = 0;
      int eng = 0;
      int math = 0; // 임시 저장소 설정

      System.out.println("┌───────┐");
      System.out.println("│     성적입력     │");
      System.out.println("└───────┘");
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

         if (!(0 <= math && math <= 100))
            System.out.println("값의 범위를 벗어났습니다. 유효범위(0~100). 다시입력해 주세요.");

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

      System.out.println("┌───────┐");
      System.out.println("│     성적출력     │");
      System.out.println("└───────┘");

      System.out.printf("국어 :%d\n", kor);
      System.out.printf("영어 :%d\n", eng);
      System.out.printf("수학 :%d\n", math);
      
      //두번째 방법
      //고쳐서 사용해야 할 부분을 교체하는 방법(도킹), 인터페이스 사용
      if(printListener != null)
    	  printListener.onPrint();
      
      System.out.printf("총점 :%d\n", exam.total());
      System.out.printf("평균 :%.2f\n", exam.avg());
      System.out.println("──────────────");
   }

   //abstract: 얘 꼭 재정의해라, 자식이 책임지는 것(확장클래스 생성)
   //첫번째 방법
   //protected abstract void onPrint();

}