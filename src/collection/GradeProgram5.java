package collection;
import java.util.Scanner;

//공유 데이터를 전역화하기
public class GradeProgram5 {
	
	static ExamCollection list;
	
	public static void main(String[] args) {
		
		//Exam[] exams = new Exam[3];
		//int current = -1;
		
		list = new ExamCollection();	
		
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
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("┌─────┐");
		System.out.println("│ 성적 관리 │");
		System.out.println("└─────┘");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 잘가");
		
		int menu= scan.nextInt();
		return menu;
	}
	
private static void inputExam(ExamCollection list) {
		
		Scanner scan = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.println("");
		System.out.println("┌─────┐");
		System.out.println("│ 성적 입력 │");
		System.out.println("└─────┘");
		
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
		
		list.add(exam); //exam에 현재 입력한 kor, eng, math 저장
	}

	private static void outputExam(ExamCollection list) {
		
		
		System.out.println("");
		System.out.println("┌─────┐");
		System.out.println("│ 성적 출력 │");
		System.out.println("└─────┘");
		
		for(int i=0;i<list.size();i++)
		{
			//Exam exam = list.exams[i];
			Exam exam = list.get(i);
			
			int kor=exam.kor;
			int eng=exam.eng;
			int math=exam.math;		
			
			int total = kor+eng+math;
			float avg=total/3.0f;
			
			//int total = total(kor , eng , math);
			//int total1 = total(exam);

			System.out.printf("국어: %d\n", kor);
			System.out.printf("영어: %d\n", eng);
			System.out.printf("수학: %d\n", math);
			System.out.printf("합계: %d\n", total);
			System.out.printf("평균: %5.1f", avg);
			System.out.println();
		}
	}

	/*private static int total(Exam exam) {
		return total(exam.kor , exam.eng , exam.math);
	}

	private static int total(int kor,int eng,int math) {
		return kor + eng + math;
	}*/

	
}