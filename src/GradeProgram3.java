import java.util.Scanner;

//������ ����ü �迭 �ٷ��
public class GradeProgram3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam[] exams = new Exam[3];
		int current = -1;

		�� : while(true)
		{
			switch(inputMainMenu())
			{
			case 1:
				inputExam(exams, current); // current ���� ��~, exam�� �����ϱ� ���� �����?
				break;
			case 2:
				outputExam(exams, current);
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

	private static void outputExam(Exam[] exam, int current) {
		// TODO Auto-generated method stub
		
		Exam[] exams = new Exam[3];
		
		int kor=exams[0].kor;
		int eng=exams[0].kor;
		int math=exams[0].kor;
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

	private static void inputExam(Exam[] exams, int current) {
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
		
		exams[++current] = exam;
		
	}

}
