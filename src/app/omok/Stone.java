package app.omok;

import java.util.Scanner;

public class Stone {
	private static boolean isWhiteTurn;
	private int x;
	private int y;
	int type;
	int current;

	public Stone() {
		x = -1;
		y = -1;
		type = 1;
		current=-1;
	}

	static {
		isWhiteTurn = false;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
	public void input()
	{
		Scanner scan = new Scanner(System.in);
		while(true)
		{
		System.out.printf("입력하세요 x sb y");

		x = scan.nextInt(); // x 입력
		y = scan.nextInt(); // y 입력
		
		type = (isWhiteTurn ? 2 : 1);
		isWhiteTurn = !isWhiteTurn;
		}
	}

	public void put(char[][] buf) {
		buf[y - 1][x - 1] = type == 1 ? '●' : '○';
	}

}