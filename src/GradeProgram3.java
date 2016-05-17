import java.util.Scanner;

//데이터 구조체 배열 다루기
public class GradeProgram3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam[] exams = new Exam[3];
		int current = -1;

		가 : while(true)
		{
			switch(inputMainMenu())
			{
			case 1:
				inputExam(exams, current); // current 값이 슝~, exam을 수집하기 위한 저장소?
				break;
			case 2:
				outputExam(exams, current);
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

	private static void outputExam(Exam[] exam, int current) {
		// TODO Auto-generated method stub
		
		Exam[] exams = new Exam[3];
		
		int kor=exams[0].kor;
		int eng=exams[0].kor;
		int math=exams[0].kor;
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

	private static void inputExam(Exam[] exams, int current) {
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
		
		exams[++current] = exam;
		
	}

}
