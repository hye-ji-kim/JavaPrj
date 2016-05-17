import java.util.Scanner;

public class OmokProgram3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=20;
		int height=20;
		
		Scanner scan = new Scanner(System.in);
		
		//오목판 배열
		char[][] board = new char[height][width];
		
		int[] xs = new int[width*height]; //400개의 방 20*20
		int[] ys = new int[width*height];
		int[] types = new int[width*height];
		int count = 0; // 문장이 실행되는 횟수
		
		//오목판 초기화\
		while(true){
		for(int y=0; y<height; y++)
			for(int x=0; x<width; x++)
				board[y][x]='┼';

				//테두리 꾸미기
					for(int i=0; i<width;i++)
						board[0][i]='┬'; //y는 그대로 두고 x만 바뀜

					for(int i=0; i<width;i++)
						board[i][0]='├'; //x는 그대로 두고 y만 바뀜

					for(int i=0; i<width;i++)
						board[height-1][i]='┴'; //board[19][i] y는 그대로 두고 x만 바뀜

					for(int i=0; i<width;i++)
						board[i][height-1]='┤'; //board[i][19] x는 그대로 두고 y만 바뀜


					board[0][0]='┌';
					board[0][width-1]='┐';
					board[height-1][0]='└';
					board[height-1][width-1]='┘';
					
					
					//사용자 입력을 받는 로직

					int ox;
					int oy;
					int type;
					
					System.out.printf("입력하세요 x sb y");
					ox = scan.nextInt(); // x 입력
					oy = scan.nextInt(); // y 입력
					
					//type=1;  1번 하얀돌 2번 검은돌	
					if(count%2==0)
						type=1;
					else
						type=2;
					
					
					for(int i=0;i<count;i++){
							if(xs[count] == ox && ys[count] == oy){
							System.out.printf("입력하세요 x sb y");
							ox = scan.nextInt(); // x 입력
							oy = scan.nextInt(); // y 입력
							}
							else
								continue;
						}
					
					//count는 참조(방 위치) ox는 값이다
					xs[count] = ox; //xs[방위치=0, 1, 2, 3...] = ox;
					ys[count] = oy; //ys[방위치=0, 1, 2, 3...] = oy;
					types[count] = type;
					count++;
					
					//오목 그리기
					for(int j=0;j<count;j++){
						if(types[j]==1) //
						board[(ys[j]-1)][(xs[j]-1)] ='●';
						else
						board[(ys[j]-1)][(xs[j]-1)] ='○';
					}
						
						
					/*board[height*0]='┤';
					board[height*19]='┬';
					board[39]='┴';
					board[height*19]='├';*/
					
					//선언했던 바둑판 출력
					for(int y=0; y<height; y++){
						for(int x=0; x<width; x++)
						System.out.printf("%c", board[y][x]);
						System.out.println();
				}
		}
		}
}