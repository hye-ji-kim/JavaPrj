import java.util.Scanner;

public class GradeProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exam exam = new Exam();
		
		
		�� : while(true)
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

	private static void outputExam(Exam exam) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("������������������������");
		System.out.println("��             ���� ���      ��");
		System.out.println("������������������������");						
		
		System.out.printf("����: %d ", exam.kor);
		System.out.printf("����: %d ", exam.eng);
		System.out.printf("����: %d", exam.math);
		System.out.println();
		
	}

	private static void inputExam(Exam exam) {
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
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}

}
