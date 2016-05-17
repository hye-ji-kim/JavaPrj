import java.util.Scanner;

public class GradeProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam exam = new Exam();
		
		
		가 : while(true)
		{
			switch(inputMainMenu())
			{
			case 1:
				inputExam(exam);
				break;
			case 2:
				outputExam(exam);
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

	private static void outputExam(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("┐││││││││││┘");
		System.out.println("─             성적 출력      ─");
		System.out.println("┌││││││││││└");						
		
		System.out.printf("국어: %d ", exam.kor);
		System.out.printf("영어: %d ", exam.eng);
		System.out.printf("수학: %d", exam.math);
		System.out.println();
		
	}

	private static void inputExam(Exam exam) {
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}

}
