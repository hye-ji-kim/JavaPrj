import java.util.Scanner;

//������ ����ü �迭 �ٷ��
public class GradeProgram4 {
	//������ ������ ���� ��ü �ٷ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exam[] exams = new Exam[3];
		//int current = -1;
		
		ExamCollection list = new ExamCollection();
		list.exams = new Exam[3]; // ������
		list.current = -1; // ������
		int x=0;
		int y;
		x+=3;
		y=x+2;
		
		
		
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
				goAway();
				break ��;
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
		System.out.println("������������������������");
		System.out.println("��             ���� ���      ��");
		System.out.println("������������������������");		
		
		//exam.kor = kor;
		//exam.eng = eng;
		//GradeProgram3.javaexam.math = math;
	
		
		System.out.printf("����: %d ", kor);
		System.out.printf("����: %d ", eng);
		System.out.printf("����: %d", math);
		System.out.printf("�հ�: ", total);
		System.out.println();
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
