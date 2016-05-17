package omok2;

import java.util.Scanner;

public class Stone {

   private int otype;
   private int ox;
   private int oy;

   private static boolean isWhiteTurn;

 //  Board size = new Board();

   static { // static 초기화 방법
      isWhiteTurn = false;
   }

   public Stone() {

      ox = -1;
      oy = -1;
      otype = 1;

   }

   // 객체지향적 성격으로는 Board에 해놓는게 더 바람직하다
   /*
    * public void put(char [][] buf){ buf[oy][ox]= otype ==1 ? '●':'○';
    * 
    * }
    */
   public void input() {

      Scanner scan = new Scanner(System.in);

      otype = isWhiteTurn ? 2 : 1;
      System.out.print("위치를 입력해 주세요.(x sp y)\n");
      ox = scan.nextInt();
      oy = scan.nextInt();
      // isWhiteTurn = !isWhiteTurn;// 흑백이 바뀌는.

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
      
      isWhiteTurn = !isWhiteTurn; //흑백을 바꿔주는

   }

}