package com.notepubs.app; //package�� �ҹ��ڷθ� �ۼ�

import java.util.Scanner;

public class Exam {
	int kor;
	int eng;
	int math;
	
	static void inputExam(Exam exam) {
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
		
		scan.close();
	}
}
