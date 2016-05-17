import java.util.Scanner;

//���� �����͸� ����ȭ�ϱ�
public class GradeProgram5 {
	
	static ExamCollection list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exam[] exams = new Exam[3];
		//int current = -1;
		
		list = new ExamCollection();
		list.exams = new Exam[3]; // ������
		list.current = -1; // ������
		
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
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("������������������������");
		System.out.println("��             ���� ����      ��");
		System.out.println("������������������������");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. �߰�");
		
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
		System.out.println("������������������������");
		System.out.println("��             ���� ���      ��");
		System.out.println("������������������������");
		
		System.out.printf("����: %d ", kor);
		System.out.printf("����: %d ", eng);
		System.out.printf("����: %d", math);
		System.out.printf("�հ�: ", total);
		System.out.printf("���: ", avg);
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
		System.out.println("������������������������");
		System.out.println("��             ���� �Է�      ��");
		System.out.println("������������������������");
		
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
		
		list.exams[++list.current] = exam;
	}
}