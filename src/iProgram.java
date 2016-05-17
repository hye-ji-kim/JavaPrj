import java.util.Scanner;

public class iProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		System.out.println("┐││││││││││┘");
		System.out.println("─             숫자 입력      ─");
		System.out.println("┌││││││││││└");
		int i= scan.nextInt();
		
		an(i);
		sum(i);
		
		System.out.println(sum(i));
	}
	
		public static int an(int i)
		{
			return 3+(i-1)*7;
		}
		
		public static int sum(int i)
		{
			if(i==1)
				return 3;
			
			return sum(i-1) +an(i);
		}	
	}

