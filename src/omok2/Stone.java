package omok2;

import java.util.Scanner;

public class Stone {

   private int otype;
   private int ox;
   private int oy;

   private static boolean isWhiteTurn;

 //  Board size = new Board();

   static { // static �ʱ�ȭ ���
      isWhiteTurn = false;
   }

   public Stone() {

      ox = -1;
      oy = -1;
      otype = 1;

   }

   // ��ü������ �������δ� Board�� �س��°� �� �ٶ����ϴ�
   /*
    * public void put(char [][] buf){ buf[oy][ox]= otype ==1 ? '��':'��';
    * 
    * }
    */
   public void input() {

      Scanner scan = new Scanner(System.in);

      otype = isWhiteTurn ? 2 : 1;
      System.out.print("��ġ�� �Է��� �ּ���.(x sp y)\n");
      ox = scan.nextInt();
      oy = scan.nextInt();
      // isWhiteTurn = !isWhiteTurn;// ����� �ٲ��.

   }

   public int getOtype() {
      return otype;
   }

   public void setOtype(int otype) {
      this.otype = otype;
   }

   public int getOx() {
      return ox;
   }

   public void setOx(int ox) {
      this.ox = ox;
   }

   public int getOy() {
      return oy;
   }

   public void setOy(int oy) {
      this.oy = oy;
   }

   public static void toggleTurn() {
      
      isWhiteTurn = !isWhiteTurn; //����� �ٲ��ִ�

   }

}