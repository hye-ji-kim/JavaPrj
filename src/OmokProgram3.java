import java.util.Scanner;

public class OmokProgram3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width=20;
		int height=20;
		
		Scanner scan = new Scanner(System.in);
		
		//������ �迭
		char[][] board = new char[height][width];
		
		int[] xs = new int[width*height]; //400���� �� 20*20
		int[] ys = new int[width*height];
		int[] types = new int[width*height];
		int count = 0; // ������ ����Ǵ� Ƚ��
		
		//������ �ʱ�ȭ\
		while(true){
		for(int y=0; y<height; y++)
			for(int x=0; x<width; x++)
				board[y][x]='��';

				//�׵θ� �ٹ̱�
					for(int i=0; i<width;i++)
						board[0][i]='��'; //y�� �״�� �ΰ� x�� �ٲ�

					for(int i=0; i<width;i++)
						board[i][0]='��'; //x�� �״�� �ΰ� y�� �ٲ�

					for(int i=0; i<width;i++)
						board[height-1][i]='��'; //board[19][i] y�� �״�� �ΰ� x�� �ٲ�

					for(int i=0; i<width;i++)
						board[i][height-1]='��'; //board[i][19] x�� �״�� �ΰ� y�� �ٲ�


					board[0][0]='��';
					board[0][width-1]='��';
					board[height-1][0]='��';
					board[height-1][width-1]='��';
					
					
					//����� �Է��� �޴� ����

					int ox;
					int oy;
					int type;
					
					System.out.printf("�Է��ϼ��� x sb y");
					ox = scan.nextInt(); // x �Է�
					oy = scan.nextInt(); // y �Է�
					
					//type=1;  1�� �Ͼᵹ 2�� ������	
					if(count%2==0)
						type=1;
					else
						type=2;
					
					
					for(int i=0;i<count;i++){
							if(xs[count] == ox && ys[count] == oy){
							System.out.printf("�Է��ϼ��� x sb y");
							ox = scan.nextInt(); // x �Է�
							oy = scan.nextInt(); // y �Է�
							}
							else
								continue;
						}
					
					//count�� ����(�� ��ġ) ox�� ���̴�
					xs[count] = ox; //xs[����ġ=0, 1, 2, 3...] = ox;
					ys[count] = oy; //ys[����ġ=0, 1, 2, 3...] = oy;
					types[count] = type;
					count++;
					
					//���� �׸���
					for(int j=0;j<count;j++){
						if(types[j]==1) //
						board[(ys[j]-1)][(xs[j]-1)] ='��';
						else
						board[(ys[j]-1)][(xs[j]-1)] ='��';
					}
						
						
					/*board[height*0]='��';
					board[height*19]='��';
					board[39]='��';
					board[height*19]='��';*/
					
					//�����ߴ� �ٵ��� ���
					for(int y=0; y<height; y++){
						for(int x=0; x<width; x++)
						System.out.printf("%c", board[y][x]);
						System.out.println();
				}
		}
		}
}