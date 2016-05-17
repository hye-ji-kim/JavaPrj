import java.util.Scanner;

//공유 데이터를 전역화하기
public class GradeProgram5 {
	
	static ExamCollection list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exam[] exams = new Exam[3];
		//int current = -1;
		
		list = new ExamCollection();
		list.exams = new Exam[3]; // 묶었다
		list.current = -1; // 묶었다
		
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
				{
					System.out.println("");
					System.out.println("성적 빠이짜이찌엔!");
					break 가;
				}
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

	private static void outputExam(ExamCollection list) {
		// TODO Auto-generated method stub
		
		Exam exam = list.exams[0];
		
		int kor=exam.kor;
		int eng=exam.eng;
		int math=exam.math;
		
		int total = total(kor , eng , math);
		int total1 = total(exam);
		
		
		float avg=total/3.0f;
		
		System.out.println("");
		System.out.println("┐││││││││││┘");
		System.out.println("─             성적 출력      ─");
		System.out.println("┌││││││││││└");
		
		System.out.printf("국어: %d ", kor);
		System.out.printf("영어: %d ", eng);
		System.out.printf("수학: %d", math);
		System.out.printf("합계: ", total);
		System.out.printf("평균: ", avg);
		System.out.println();
	}

	private static int total(Exam exam) {
		// TODO Auto-generated method stub
		return total(exam.kor , exam.eng , exam.math);
	}

	private static int total(int kor,int eng,int math) {
		// TODO Auto-generated method stub
		return kor + eng + math;
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