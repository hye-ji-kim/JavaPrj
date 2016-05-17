package oop.inhe.is;

import java.util.Scanner;

public class Exam {// 정의

   private int kor;// 멤버변수 or Property or Attribute
   private int eng;
   private int math;
   private int total;
   private float avg;

   public Exam() {// 생성자

      /*
       * this.kor = 0; // 기본 값 초기화 this.eng = 0; this.math = 0;
       */

      this(0, 0, 0); // 코드 중복 제거

   }

   public Exam(int kor, int eng, int math) {// 생성자 오버로드 초기값 설정

      this.kor = kor;
      this.eng = eng;
      this.math = math;

   }

   // 내가 가지고 있는 exam의 구조를 못보니 exam 에서 제발 kor값 좀 꺼내줭

   public int getKor()// 멤버함수 or 메서드
   {
      return kor;
   }

   public void setKor(int kor) {
      this.kor = kor;
   }

   public int getEng() {
      return eng;
   }

   public void setEng(int eng) {
      this.eng = eng;
   }

   public int getMath() {
      return math;
   }

   public void setMath(int math) {
      this.math = math;
   }

   public int total() {
   return kor+eng+math;
   }
   public float avg() {
      return total()/3.0f;
      //return (this.total()/3.0f);
   }

}