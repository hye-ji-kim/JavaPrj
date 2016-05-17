package app.omok;
import java.util.Scanner;

public class Board {
	private int width;
	private int height;
	private char[][] buf;
	int current;
	boolean duplicate;

public Board()
	{
		width=20;
		height=20;
		buf = new char[height][width];
		
		initboard();		
	}

/*public void putStone(Stone stone)
{
	buf[stone.getY()][stone.getX()] = stone.getType() ==1 ? '¡Ü' : '¡Û';
}*/

/*public void put(char[][] buf){
 buf[y][x] = type == 1 ? '¡Ü':'¡Û';
}*/

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public char[][] getBuf() {
		return buf;
	}

	public void setBuf(char[][] buf) {
		this.buf = buf;
	}

public void print()
	{
		for(int y=0; y<height; y++){
			for(int x=0; x<width; x++)
			System.out.printf("%c", buf[y][x]);
			System.out.println();
	}
}

private void initboard() {	//?
	// TODO Auto-generated method stub
	for(int y=0; y<height; y++)
	{
		for(int x=0; x<width; x++)
			buf[y][x]='¦«';

			//Å×µÎ¸®
				for(int i=0; i<width;i++)
					buf[0][i]='¦©'; 

				for(int i=0; i<width;i++)
					buf[i][0]='¦¨';
				
				for(int i=0; i<width;i++)
					buf[height-1][i]='¦§';

				for(int i=0; i<width;i++)
					buf[i][height-1]='¦ª';

				buf[0][0]='¦¤';
				buf[0][width-1]='¦¥';
				buf[height-1][0]='¦£';
				buf[height-1][width-1]='¦¦';
	}

}

void add(Stone stone) {
	
}

public boolean duplicate(Stone stone) {
	
	current=0;
	for(int i=0;i<current;i++)
		if(stone.getX()==stone.getX())
		return true;
	
	return false;
}
}