import java.util.Random;

public class Lotto2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] lotto = new int[6];
		//int bonus = 0;

		//중복 검사 입력
		for(int i=0; i<6; i++)
			{
			lotto[i] = rand.nextInt(45)+1;
			
			if(i>0) // i>0 일때만 중복검사
				{
				for( int j=0; j<i; j++)
					{
					if(lotto[i-j-1]==lotto[i])
						i -= 1;
					}
				}
			}
			
		//번호출력
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i] );
			System.out.println();

		//정렬하기 버블정렬 (첫번째와 두번째 공간 바꿈)
		int temp; //값을 교환할 수 있는 임시 거처 i<6이면 7번째 값이 필요
		
		for(int j=0;j<5;j++){
			for(int i=0;i<5-j;i++)
				if(lotto[i]>lotto[i+1]){
					temp =lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1]= temp;
		}
			
		//번호출력
		for(int i=0; i<6; i++)
			System.out.printf("%d ", lotto[i] );
			System.out.println();
		}
	}
}