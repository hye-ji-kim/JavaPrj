package omok2;

public class Board { // ������ ��¶� ������ ���� ��

   private int width; // ����
   private int height;// ����

   private char[][] buf;
   private Stone[] stones;
   private int current;

   public Board() {// �ʱ�ȭ

      width = 20;
      height = 20;
      buf = new char[width][height];
      stones = new Stone[width * height];
      current = -1;

      // initBoard(); // ������ �ʱ�ȭ

   }

   public void initBoard() {

      for (int j = 0; j < height; j++) {
         for (int i = 0; i < width; i++) {
            buf[j][i] = '��';
         }
      }
      for (int i = 0; i < width; i++)
         buf[0][i] = '��';

      for (int i = 0; i < height; i++)
         buf[i][width - 1] = '��';

      for (int i = 0; i < height; i++)
         buf[i][0] = '��';

      for (int i = 0; i < height; i++)
         buf[height - 1][i] = '��';

      buf[0][0] = '��';
      buf[0][width - 1] = '��';
      buf[height - 1][0] = '��';
      buf[height - 1][width - 1] = '��';

   }

   public char[][] getBuf() {
      return buf;
   }

   public void setBuf(char[][] buf) {
      this.buf = buf;
   }

   public void print() {

      initBoard();//������ �ʱ�ȭ

      for (int i = 0; i < current + 1; i++)
         putStone(stones[i]);

      System.out.println("");
      // ������ ���
      for (int y = 0; y < height; y++) {
         for (int x = 0; x < width; x++) {
            System.out.printf("%c", buf[y][x]);
         }
         System.out.println("");
      }
   }

   public void putStone(Stone stone) {// Stone stone = new Stone???

      buf[stone.getOy() - 1][stone.getOx() - 1] = stone.getOtype() == 1 ? '��' : '��';

   }

   public void add(Stone stone) { // ������ �ֱ�����? //���ο��� �޾ƿ��� stone

      stones[++current] = stone;

      Stone.toggleTurn();

   }

   public boolean checkDuplicated(Stone stone) { //�ߺ�üũ
      
      for (int i = 0; i < current + 1; i++)
         if (stones[i].getOy() == stone.getOy()&&stones[i].getOx()==stone.getOx()) {
            return true;

         }
      return false;

   }

}