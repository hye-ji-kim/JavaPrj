package oop.inhe.c;

import java.util.Scanner;

//�� Ŭ������ ���� �и��̹Ƿ� ���� �����ؼ� ������� ������
//�߻�ȭ : ���� �и� Ŭ����

public abstract class Exam {// ����
	//abstract Ű����: ���ľ��� ���ϰ� ���ƹ���
	//�� Ŭ������ �߻�(�Ϲ�, ����)Ŭ�������� �����Ϸ����� �˷���
	
   private int kor;// ������� or Property or Attribute
   private int eng;
   private int math;
 /*  private int total;
   private float avg;
*/
   public Exam() {// ������

      /*
       * this.kor = 0; // �⺻ �� �ʱ�ȭ this.eng = 0; this.math = 0;
       */

      this(0, 0, 0); // �ڵ� �ߺ� ����

   }

   public Exam(int kor, int eng, int math) {// ������ �����ε� �ʱⰪ ����

      this.kor = kor;
      this.eng = eng;
      this.math = math;

   }

   // ���� ������ �ִ� exam�� ������ ������ exam ���� ���� kor�� �� �����a

   public int getKor()// ����Լ� or �޼���
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