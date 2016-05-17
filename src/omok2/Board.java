package omok2;

public class Board { // 오목판 출력때 쓰려고 만든 판

   private int width; // 가로
   private int height;// 세로

   private char[][] buf;
   private Stone[] stones;
   private int current;

   public Board() {// 초기화

      width = 20;
      height = 20;
      buf = new char[width][height];
      stones = new Stone[width * height];
      current = -1;

      // initBoard(); // 오목판 초기화

   }

   public void initBoard() {

      for (int j = 0; j < height; j++) {
         for (int i = 0; i < width; i++) {
            buf[j][i] = '┼';
         }
      }
      for (int i = 0; i < width; i++)
         buf[0][i] = '┤';

      for (int i = 0; i < height; i++)
         buf[i][width - 1] = '┴';

      for (int i = 0; i < height; i++)
         buf[i][0] = '┬';

      for (int i = 0; i < height; i++)
         buf[height - 1][i] = '├';

      buf[0][0] = '┐';
      buf[0][width - 1] = '┘';
      buf[height - 1][0] = '┌';
      buf[height - 1][width - 1] = '└';

   }

   public char[][] getBuf() {
      return buf;
   }

   public void setBuf(char[][] buf) {
      this.buf = buf;
   }

   public void print() {

      initBoard();//오목판 초기화

      for (int i = 0; i < current + 1; i++)
         putStone(stones[i]);

      System.out.println("");
      // 오목판 출력
      for (int y = 0; y < height; y++) {
         for (int x = 0; x < width; x++) {
            System.out.printf("%c", buf[y][x]);
         }
         System.out.println("");
      }
   }

   public void putStone(Stone stone) {// Stone stone = new Stone???

      buf[stone.getOy() - 1][stone.getOx() - 1] = stone.getOtype() == 1 ? '●' : '○';

   }

   public void add(Stone stone) { // 역할을 주기위해? //메인에서 받아오는 stone

      stones[++current] = stone;

      Stone.toggleTurn();

   }

   public boolean checkDuplicated(Stone stone) { //중복체크
      
      for (int i = 0; i < current + 1; i++)
         if (stones[i].getOy() == stone.getOy()&&stones[i].getOx()==stone.getOx()) {
            return true;

         }
      return false;

   }

}