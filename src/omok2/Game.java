package omok2;

public class Game {

   public static void main(String[] args) {

      Board size = new Board();

      while (true) {

         Stone stone = new Stone();

         size.print();

         stone.input();

         // size.putStone(stone);

         if(size.checkDuplicated(stone)==true)
            System.out.println("�����Դϴ�.");
         
         else 
         size.add(stone);

         // stone.put(size.getBuf());

      }

   }
}