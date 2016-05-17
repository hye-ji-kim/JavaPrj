package collection;
import java.util.Scanner;

//���� �����͸� ����ȭ�ϱ�
public class GradeProgram5 {
	
	static ExamCollection list;
	
	public static void main(String[] args) {
		
		//Exam[] exams = new Exam[3];
		//int current = -1;
		
		list = new ExamCollection();	
		
		�� : while(true)
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
					System.out.println("���� ����¥���!");
					break ��;
				}
			}
		}
}

	private static int inputMainMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("��������������");
		System.out.println("�� ���� ���� ��");
		System.out.println("��������������");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. �߰�");
		
		int menu= scan.nextInt();
		return menu;
	}
	
private static void inputExam(ExamCollection list) {
		
		Scanner scan = new Scanner(System.in);
		
		int kor;
		int eng;
		int math;
		
		System.out.println("");
		System.out.println("��������������");
		System.out.println("�� ���� �Է� ��");
		System.out.println("��������������");
		
		System.out.print("����: ");
		kor = scan.nextInt();
		
		System.out.print("����: ");
		eng = scan.nextInt();
		
		System.out.print("����: ");
		math = scan.nextInt();
		
		Exam exam = new Exam();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		list.add(exam); //exam�� ���� �Է��� kor, eng, math ����
	}

	private static void outputExam(ExamCollection list) {
		
		
		System.out.println("");
		System.out.println("��������������");
		System.out.println("�� ���� ��� ��");
		System.out.println("��������������");
		
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

			System.out.printf("����: %d\n", kor);
			System.out.printf("����: %d\n", eng);
			System.out.printf("����: %d\n", math);
			System.out.printf("�հ�: %d\n", total);
			System.out.printf("���: %5.1f", avg);
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