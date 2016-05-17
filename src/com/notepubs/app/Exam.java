package com.notepubs.app; //package는 소문자로만 작성

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
		
		scan.close();
	}
}
