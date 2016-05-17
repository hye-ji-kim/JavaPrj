import java.util.Scanner;

//데이터 구조체 배열 다루기
public class GradeProgram4 {
	//데이터 수집을 위한 객체 다루기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exam[] exams = new Exam[3];
		//int current = -1;
		
		ExamCollection list = new ExamCollection();
		list.exams = new Exam[3]; // 묶었다
		list.current = -1; // 묶었다
		int x=0;
		int y;
		x+=3;
		y=x+2;
		
		
		
		가 : while(true)
		{
			switch(inputMainMenu())
			{
			case 1:
				inputExam(list);
				break;
			case 2:
				outputExam(list);
				break;
			case 3:
				goAway();
				break 가;
			}
		}
}

	private static int inputMainMenu() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("┐││││││││││┘");
		System.out.println("─             성적 관리      ─");
		System.out.println("┌││││││││││└");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 잘가");
		
		int menu= scan.nextInt();

		return menu;
	}

	private static void goAway() {
		// TODO Auto-generated method stub
		
	}

	private static void outputExam(ExamCollection list) {
		// TODO Auto-generated method stub
		
		Exam[] exams = new Exam[3];
		
		int kor=0;
		int eng=0;
		int math=0;
		int total=kor + eng + math;
		
		System.out.println("");
		System.out.println("┐││││││││││┘");
		System.out.println("─             성적 출력      ─");
		System.out.println("┌││││││││││└");		
		
		//exam.kor = kor;
		//exam.eng = eng;
		//GradeProgram3.javaexam.math = math;
	
		
		System.out.printf("국어: %d ", kor);
		System.out.printf("영어: %d ", eng);
		System.out.printf("수학: %d", math);
		System.out.printf("합계: ", total);
		System.out.println();
	}

	private static void inputExam(ExamCollection list) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.println("");
		System.out.println("┐││││││││││┘");
		System.out.println("─             성적 입력      ─");
		System.out.println("┌││││││││││└");
		
		System.out.print("국어: ");
		kor = scan.nextInt();
		System.out.print("영어: ");
		eng = scan.nextInt();
		System.out.print("수학: ");
		math = scan.nextInt();
		
		Exam exam = new Exam();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		list.exams[++list.current] = exam;
		
	}

}
